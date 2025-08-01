public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(": ")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.replace("[","").replace("]","").split(": ")[0].trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+ " ("+ logLevel(logLine) + ")";
    }
    
}
