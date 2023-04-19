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
    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten

        switch (figureNr) {
            case 0:
                isExit();
            case 1:
                figure = new FigureH();
                break;
            case 2:
                figure = new FigureL();
                break;
            case 3:
                figure = new FigureO();
                break;
            case 4:
                figure = new FigureO2();
                break;
            case 5:
                figure = new FigureI();
                break;
            case 6:
                figure = new FigureMinus();
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
            } else {
                break;
            }
        } while (true);
    }

    private boolean isExit() {
        if (figureNr == 0) {
            return this.exit = true;
        }
        return this.exit = false;
    }
}