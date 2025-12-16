public class LogAnalyzer {

    public static void main(String[] args) {

        String[] logs = {
            "INFO Service started successfully",
            "INFO Processing request id=12345",
            "ERROR Database connection timeout",
            "INFO Retrying request",
            "INFO Request completed"
        };

        System.out.println("Analyzing application logs...\n");

        for (String log : logs) {
            if (log.contains("ERROR")) {
                System.out.println("ERROR FOUND: " + log);
            } else {
                System.out.println(log);
            }
        }
    }
}
