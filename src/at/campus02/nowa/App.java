package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.util.Scanner;

import java.io.PrintStream;


public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private Figure figure;

    public int size;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }


    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while (!exit) {
            readUserInput();
            updateState();
            printState();
        }
    }

    private void initialize() {
        //TODO: Initialisierungen hier durchführen
    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();
        if(figureNr != 0) {
        inputSize();}
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten

        switch (figureNr) {
            case 0:
                exit = true;
                figure = null;
                break;
            case 1:
                figure = new FigureH(size);
                break;
            case 2:
                figure = new FigureL(size);
                break;
            case 3:
                figure = new FigureO(size);
                break;
            case 4:
                figure = new FigureO2(size);
                break;
            case 5:
                figure = new FigureI(size);
                break;
            case 6:
                figure = new FigureMinus(size);
                break;
            default:
                break;
        }
    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
        if (figure != null) {
            output.println(figure);
        }
    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Enter a number from 1-6 to show your graphic or 0 to exit");
            figureNr = input.nextInt();
            if (figureNr < 0 || figureNr > 6) {
                output.println("Not a valid input");
            }
            break;
        } while (true);
    }


    private boolean isExit() {
        if (figureNr == 0) {
            return this.exit = true;
        }
        return this.exit = false;
    }

    public static void printDoubleX() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 2 || i == 3) {
                    System.out.print("X");
                } else if (j == 2 || j == 3) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void inputSize() {
        output.println("Choose a size: ");
        size = input.nextInt();
    }

}