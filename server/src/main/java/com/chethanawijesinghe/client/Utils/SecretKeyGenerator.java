package com.chethanawijesinghe.client.Utils;
import java.security.SecureRandom;
import java.util.Base64;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        // SecureRandom to generate cryptographically strong random numbers
        SecureRandom secureRandom = new SecureRandom();

        // Create a byte array to hold the random bytes (for HMAC256 use 32 bytes, for HMAC512 use 64 bytes)
        byte[] keyBytes = new byte[32];  // 32 bytes for HMAC256
        secureRandom.nextBytes(keyBytes);

        // Encode the byte array into a Base64 string
        String secretKey = Base64.getEncoder().encodeToString(keyBytes);

        // Output the secret key
        System.out.println("Your Secret Key: " + secretKey);
    }
}
