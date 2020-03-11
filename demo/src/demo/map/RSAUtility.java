package demo.map;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAUtility {
	
	static String key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlVOFAL4qVyIVjoer/cLNtRqFhwo2UMl5\r\n"
			+ "Scx8YhH51DeqVTmDuf0zqF9Ngd9mJq3Kitm4GmL8yUIhU+0xHiEC6uFFmbRZb5VxWqnQWsgyQVqF\r\n"
			+ "SCOl7Hyl8R5HxHwE1T5pAPlJQRq1/EsCxxAQXS6ZxA4KYFPNYPCAl9Cmvt/O8sfJ38NSYisKEZtD\r\n"
			+ "cs7iy2icZUsKIptGU93G25eJgqaeoHAbjNVs3Iex7aaWaqDbfhbpBVBKte+L89Bts96+IjJbP7Qw\r\n"
			+ "WSUW9v0n89FBvn4D1eSrJHZlITZg7KVIWYuSKsb4jeCAMA4mDu8CtR29LOOGmUXq+z0wVoFsb6VO\r\n"
			+ "abm1pwIDAQAB";
	public static String encrypt(String plainText) {
		try {

			PublicKey publicKey = KeyFactory.getInstance("RSA")
					.generatePublic(new X509EncodedKeySpec(Base64.getMimeDecoder().decode(key)));
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return Base64.getMimeEncoder().encodeToString(cipher.doFinal(plainText.getBytes("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decrypt(String data) {
		try {

			PublicKey publicKey = KeyFactory.getInstance("RSA")
					.generatePublic(new X509EncodedKeySpec(Base64.getMimeDecoder().decode(key)));
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			return new String(cipher.doFinal(Base64.getMimeDecoder().decode(data)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		String en = encrypt("amount=20&currency=INR&");
		System.err.println("EN : " + en);
		String de = decrypt(en);
		System.err.println("DE : " + de);

	}

}