public class OtpGenerator {

    public static void main(String[] args) {

        // array to store 10 OTP numbers
        int[] otps = new int[10];

        // generating OTPs 10 times
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateSixDigitOTP();
        }

        // displaying generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        // calling method to check uniqueness
        boolean isUnique = checkUniqueOTPs(otps);

        // displaying result
        System.out.println("\nAre all OTPs unique? : " + isUnique);
    }

    // method to generate 6 digit OTP number
    public static int generateSixDigitOTP() {
        // generates number between 100000 and 999999
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // method to check if all OTPs are unique
    public static boolean checkUniqueOTPs(int[] otps) {

        // comparing each OTP with others
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all OTPs are unique
    }
}
