package cc.caffeinatedcreators.hax;

import java.io.IOException;
import java.util.function.Consumer;

import lombok.SneakyThrows;
import xyz.e3ndr.consoleutil.ConsoleUtil;
import xyz.e3ndr.consoleutil.ansi.ConsoleColor;
import xyz.e3ndr.consoleutil.consolewindow.ConsoleWindow;

public class Hax {

    public static void main(String[] args) throws IOException, InterruptedException {
        ConsoleUtil.summonConsoleWindow();

        ConsoleWindow window = ConsoleUtil.getAttachedConsoleWindow()
            .setSize(100, 41)
            .setTextColor(ConsoleColor.WHITE)
            .clearScreen();

//        repeat(3, (i) -> {
//            try {
//                window.setTitle("STARTING IN " + i);
//            } catch (IOException | InterruptedException e) {}
//            sleep(1000);
//        });

        window.setTitle("EXECUTING");

        try {

            // Let the cursor blink for a bit.
            sleep(200);

            window
                .setTextColor(ConsoleColor.RED)
                .write("BOOTING UP CAFFEINATED CREATORS EVENT OS\n\n")
                .setTextColor(ConsoleColor.WHITE);

            sleep(750);

            load(window, ConsoleColor.LIGHT_RED, "STARTING", "STEAM");
            load(window, ConsoleColor.LIGHT_RED, "COUNTING", "POLYGONS");
            load(window, ConsoleColor.LIGHT_RED, "LOADING", "OVER-PRODUCED EVENT TRAILER");
            load(window, ConsoleColor.LIGHT_RED, "STARTING", "OBS");
            load(window, ConsoleColor.LIGHT_RED, "LOADING", "ALL GAMES");
            load(window, ConsoleColor.LIGHT_GREEN, "RUNNING", ConsoleColor.GREEN.getForeground() + "1337 SCRIPTS");
            load(window, ConsoleColor.LIGHT_RED, "DOWNLOADING", "MORE RAM");
            load(window, ConsoleColor.LIGHT_RED, "ADDING", "MORE RGB");
            load(window, ConsoleColor.LIGHT_RED, "PUSHING", "MORE FPS");
            load(window, ConsoleColor.LIGHT_RED, "STARTING", "DISCORD");
            load(window, ConsoleColor.LIGHT_RED, "INVITING", "MORE FRIENDS");
            load(window, ConsoleColor.LIGHT_RED, "KILLING", "BAD GUYS");
            load(window, ConsoleColor.LIGHT_RED, "LOADING", "N00B TUBE");
            load(window, ConsoleColor.RED, "DELETING", "FORTNITE");
            load(window, ConsoleColor.CYAN, "SAYING", "'HI' TO CHAT");
            load(window, ConsoleColor.CYAN, "LEARNING", "A PROGRAMMING LANGUAGE");
            window
                .setTextColor(ConsoleColor.WHITE)
                .write("  > %sHello world!\n\n", ConsoleColor.GRAY.getForeground());
            load(window, ConsoleColor.LIGHT_RED, "THRASHING", "RAGDOLLS");
            load(window, ConsoleColor.CYAN, "PETTING", "CAT BOYS");
            load(window, ConsoleColor.CYAN, "GIVING", "HEADPATS (uWu)");
            load(window, ConsoleColor.CYAN, "MAKING", "STICKY GRENADES");
            load(window, ConsoleColor.CYAN, "LOCATING", "EPIC GAMER MOVE");
            load(window, ConsoleColor.LIGHT_RED, "LOADING", "SPOTIFY");

            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "STREAM DECK");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "ANALYZER");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "FUCKING MODERATOR STACE");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "SOUND FILTER");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "6 MONITORS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "PEDALS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "DRUMS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "GAMING GUITAR");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "CONTROLLERS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "6 SKONSOLES");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "10 COMPUTERS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "BUNCH OF FUCKIN' WIRES");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "SOUND PADS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "SPEAKERS");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "ANTENNA");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "SATELLITE");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "DOG");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "DOG CAM");
            fastLoad(window, ConsoleColor.BLUE, "CHECKING", "CAT CAM");

            sleep(250);

            window
                .setTextColor(ConsoleColor.GREEN)
                .write("\n\nSTARTING TRAILER\n\n");

            sleep(250);

            String art = getArt();

            window
                .write("\n\n")
                .write(art)
                .write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            window.setTitle("DONE");
            sleep(Long.MAX_VALUE);
        }
    }

    public static void load(ConsoleWindow window, ConsoleColor color, String prefix, String program) {
        window
            .setTextColor(color)
            .write(prefix)
            .setTextColor(ConsoleColor.WHITE)
            .write(" %s...", program);

        sleep(450);

        window
            .cursorLeft(3)
            .setTextColor(ConsoleColor.LIGHT_GREEN)
            .write(" DONE\n\n");

        sleep(75);
    }

    public static void fastLoad(ConsoleWindow window, ConsoleColor color, String prefix, String program) {
        window
            .setTextColor(color)
            .write(prefix)
            .setTextColor(ConsoleColor.WHITE)
            .write(" %s...", program);

        sleep(100);

        window
            .cursorLeft(3)
            .setTextColor(ConsoleColor.LIGHT_GREEN)
            .write(" DONE\n");

        sleep(50);
    }

    @SneakyThrows
    public static void sleep(long millis) {
        Thread.sleep(millis);
    }

    public static void repeat(int x, Consumer<Integer> func) {
        while (x > 0) {
            func.accept(x);
            x--;
        }
    }

    public static void repeat(int x, Runnable func) {
        while (x > 0) {
            func.run();
            x--;
        }
    }

    public static String getArt() throws IOException {
        final int WIDTH = 100;
        final int HEIGHT = 40;

        String[] cyanArt = FileUtil.loadResource("CC-Cyan.txt").replace("\r", "").split("\n");
        String[] orangeArt = FileUtil.loadResource("CC-Orange.txt").replace("\r", "").split("\n");
        String[] brownArt = FileUtil.loadResource("CC-Brown.txt").replace("\r", "").split("\n");
        String[] whiteArt = FileUtil.loadResource("CC-White.txt").replace("\r", "").split("\n");

        String[] result = new String[HEIGHT];

        for (int y = 0; y < HEIGHT; y++) {
            StringBuilder currentLine = new StringBuilder();

            char[] cyan = cyanArt[y].toCharArray();
            char[] orange = orangeArt[y].toCharArray();
            char[] brown = brownArt[y].toCharArray();
            char[] white = whiteArt[y].toCharArray();

            for (int x = 0; x < WIDTH; x++) {
                if (cyan[x] != ' ') {
                    currentLine
                        .append(ConsoleColor.CYAN.getForeground())
                        .append(cyan[x]);
                } else
                    if (orange[x] != ' ') {
                        currentLine
                            .append(ConsoleColor.LIGHT_RED.getForeground())
                            .append(orange[x]);
                    } else
                        if (brown[x] != ' ') {
                            currentLine
                                .append(ConsoleColor.DARK_GRAY.getForeground())
                                .append(brown[x]);
                        } else
                            if (white[x] != ' ') {
                                currentLine
                                    .append(ConsoleColor.WHITE.getForeground())
                                    .append(white[x]);
                            } else {
                                currentLine.append(' ');
                            }
            }

            result[y] = currentLine.toString();
        }

        return String.join("\n", result);
    }

}
