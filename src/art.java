public class art {
    public art (int fault){
        switch (fault) {
            case 0:
                System.out.println(
                        " +---+\n" +
                                "     |\n" +
                                "     |\n" +
                                "     |\n" +
                                "    ==="
                );
                break;

            case 1:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                "     |\n" +
                                "     |\n" +
                                "    ==="
                );
                break;

            case 2:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                " |   |\n" +
                                "     |\n" +
                                "    ==="
                );
                break;

            case 3:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                "/|   |\n" +
                                "     |\n" +
                                "    ==="
                );
                break;

            case 4:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                "/|\\  |\n" +
                                "     |\n" +
                                "    ==="
                );
                break;

            case 5:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                "/|\\  |\n" +
                                "/    |\n" +
                                "    ==="
                );
                break;

            case 6:
                System.out.println(
                        " +---+\n" +
                                " O   |\n" +
                                "/|\\  |\n" +
                                "/ \\  |\n" +
                                "    ==="
                );
                System.out.println("Game Over!");
                break;

            default:
                break;
        }

    }
}


