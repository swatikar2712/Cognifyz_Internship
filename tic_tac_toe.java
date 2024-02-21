import java.util.*;
public class tic_tac_toe {
    private static char[][] base = new char[3][3];
    private static char currPlayer = 'X';
    private static boolean gameEnd = false;
    public static void main(String[] args) {
        initialBase();
        playGame();}
    private static void initialBase() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                base[i][j] = '-';
            }}}  
    private static void printBase() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(base[i][j] + " ");}
            System.out.println();
        }} 
    private static boolean baseFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (base[i][j] == '-') {
                    return false;
                }}}      
        return true;}
    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (base[i][0] == currPlayer && base[i][1] == currPlayer && base[i][2] == currPlayer) {
                return true;}
            if (base[0][i] == currPlayer && base[1][i] == currPlayer && base[2][i] == currPlayer) {
                return true;
            }}     
        if (base[0][0] == currPlayer && base[1][1] == currPlayer && base[2][2] == currPlayer) {
            return true;}   
        if (base[0][2] == currPlayer && base[1][1] == currPlayer && base[2][0] == currPlayer) {
            return true;}  
        return false;}
    private static void Switch() {
        currPlayer = (currPlayer == 'X') ? 'O' : 'X';}
    private static void makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || base[row][col] != '-') {
            System.out.println("Invalid move. Try again.");}
        else {
            base[row][col] = currPlayer;
            if (checkWin()) {
                System.out.println("Player " + currPlayer + " wins!");
                gameEnd = true;}
            else if (baseFull()) {
                System.out.println("It's a draw!");
                gameEnd = true;}
            else {
                Switch();}}}
    private static void playGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my first task of level 2 - Tic-Tac-Toe!");
        while (!gameEnd) {
            printBase();
            System.out.println("Player " + currPlayer + "'s turn. Enter row (0-2) and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            makeMove(row, col);}   
        sc.close();}}
