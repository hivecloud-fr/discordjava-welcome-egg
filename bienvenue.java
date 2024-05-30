public class bienvenue {
    public static void main(String[] args) {
        String asciiArt = "  _  _ _          ___ _             _ \n" +
                          " | || (_)_ _____ / __| |___ _  _ __| |\n" +
                          " | __ | \\ V / -_) (__| / _ \\ || / _\\`|\n" +
                          " |_||_|_|\\_/\\___|\\___|_\\___/\\_,_\\__,_|\n";

        String[] coloredAsciiArt = asciiArt.split("");
        for (int index = 0; index < coloredAsciiArt.length; index++) {
            String charColor;
            switch (index % 6) {
                case 0:
                    charColor = "\u001B[31m"; // Red
                    break;
                case 1:
                    charColor = "\u001B[32m"; // Green
                    break;
                case 2:
                    charColor = "\u001B[33m"; // Yellow
                    break;
                case 3:
                    charColor = "\u001B[34m"; // Blue
                    break;
                case 4:
                    charColor = "\u001B[35m"; // Magenta
                    break;
                case 5:
                    charColor = "\u001B[36m"; // Cyan
                    break;
                default:
                    charColor = "\u001B[0m"; // Reset
            }
            coloredAsciiArt[index] = charColor + coloredAsciiArt[index];
        }

        System.out.println(String.join("", coloredAsciiArt));
        System.out.println("\n\u001B[0mBienvenue sur votre hébergement Discord.JS propulsé par \u001B[34mHiveCloud.FR\u001B[0m\n" +
                           "Pour mettre en place votre instance, connectez-vous via le serveur SFTP en cliquant sur la catégorie \"Paramètres\".\n" +
                           "\u001B[32mMerci de votre confiance\u001B[0m !\n\n" +
                           "\u001B[31m# Liens utiles\u001B[0m\n" +
                           "Site internet: \u001B[36mhttps://hivecloud.fr/\u001B[0m\n" +
                           "Discord: \u001B[36mhttps://discord.hivecloud.fr/\u001B[0m\n");
        System.out.println();
    }
}
