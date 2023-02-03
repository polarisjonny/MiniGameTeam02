package com.kh.game;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GameRSP {

public static void printAscii() {
System.out.println("⠀⠀⠀⠀⠀⣠⡴⠖⠒⠲⠶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠖⠒⢶⣄⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⢀⡾⠁⠀⣀⠔⠁⠀⠀⠈⠙⠷⣤⠦⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⠀⠀⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⣠⠞⠛⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠈⢿⡀⢠⡶⠒⠳⠶⣄⠀⠀⠀⠀⠀⣴⠟⠁⠀⠀⠀⣰⠏⠀⢀⣤⣤⣄⡀⠀⠀");
System.out.println("⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠛⠛⠃⠸⡇⠈⣇⠸⡇⠀⠀⠀⠘⣇⠀⠀⣠⡾⠁⠀⠀⠀⢀⣾⣣⡴⠚⠉⠀⠀⠈⠹⡆⠀");
System.out.println("⣹⡷⠤⠤⠤⠄⠀⠀⠀⠀⢠⣤⡤⠶⠖⠛⠀⣿⠀⣿⠀⢻⡄⠀⠀⠀⢻⣠⡾⠋⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀⠀⠀⢀⣠⡾⠃⠀");
System.out.println("⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠖⠋⢀⣿⣠⠏⠀⠀⣿⠀⠀⠀⠘⠉⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⣠⠶⠋⠁⠀⠀⠀");
System.out.println("⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀⠠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⢀⣴⡿⠥⠶⠖⠛⠛⢶⡄");
System.out.println("⠀⠉⢿⡋⠉⠉⠁⠀⠀⠀⠀⠀⢀⣠⠾⠋⠀⠀⠀⠀⢀⣰⡇⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⢀⣠⠼⠃");
System.out.println("⠀⠀⠈⠛⠶⠦⠤⠤⠤⠶⠶⠛⠋⠁⠀⠀⠀⠀⠀⠀⣿⠉⣇⠀⡴⠟⠁⣠⡾⠃⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣤⠶⠛⠉⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⢀⣠⣤⣀⣠⣤⠶⠶⠒⠶⠶⣤⣀⠀⠀⠀⢻⡄⠹⣦⠀⠶⠛⢁⣠⡴⠀⠀⠀⠀⠀⠀⣠⡶⠛⠉⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⢀⡴⠋⣠⠞⠋⠁⠀⠀⠀⠀⠙⣄⠀⠙⢷⡀⠀⠀⠻⣄⠈⢷⣄⠈⠉⠁⠀⠀⠀⢀⣠⡴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⢀⡾⠁⣴⠋⠰⣤⣄⡀⠀⠀⠀⠀⠈⠳⢤⣼⣇⣀⣀⠀⠉⠳⢤⣭⡿⠒⠶⠶⠒⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⢸⠃⢰⠇⠰⢦⣄⡈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠓⠲⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠸⣧⣿⠀⠻⣤⡈⠛⠳⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠈⠹⣆⠀⠈⠛⠂⠀⠀⠀⠀⠀⠀⠈⠐⠒⠒⠶⣶⣶⠶⠤⠤⣤⣠⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠳⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠈⠻⣦⣀⠀⠀⠀⠀⠐⠲⠤⣤⣀⡀⠀⠀⠀⠀⠀⠉⢳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠶⠤⠤⠤⠶⠞⠋⠉⠙⠳⢦⣄⡀⠀⠀⠀⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠳⠦⠾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
}

public static byte printCount = 1;

public static void printComHand(byte comState) {
if(comState == 1) {
switch(printCount) {
case 1: System.out.print("                            "); printCount++; break;
case 3: System.out.print("⠀⠀⠀⢀⣠⣤⣀⣠⣤⠶⠶⠒⠶⠶⣤⣀⠀⠀⠀          "); printCount++; break;
case 5: System.out.print("⠀⢀⡴⠋⣠⠞⠋⠁⠀⠀⠀⠀⠙⣄⠀⠙⢷⡀⠀⠀        ⠀"); printCount++; break;
case 7: System.out.print("⢀⡾⠁⣴⠋⠰⣤⣄⡀⠀⠀⠀⠀⠈⠳⢤⣼⣇⣀⣀⠀        "); printCount++; break;
case 9: System.out.print("⢸⠃⢰⠇⠰⢦⣄⡈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠓⠲⢦⣄⠀⠀"); printCount++; break;
case 11: System.out.print("⠸⣧⣿⠀⠻⣤⡈⠛⠳⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢻⡆⠀"); printCount++; break;
case 13: System.out.print(" ⠈⠹⣆⠀⠈⠛⠂⠀⠀⠀⠀⠀⠀⠈⠐⠒⠒⠶⣶⣶⠶⠤⠤⣤⣠⡼⠃ "); printCount++; break;
case 15: System.out.print(" ⠀⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠳⢦⣀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 17: System.out.print(" ⠀⠀⠀⠈⠻⣦⣀⠀⠀⠀⠀⠐⠲⠤⣤⣀⡀⠀⠀⠀⠀⠀⠉⢳⡄⠀⠀⠀⠀"); printCount++; break;
case 19: System.out.print("  ⠀⠀⠀⠀⠀⠉⠛⠶⠤⠤⠤⠶⠞⠋⠉⠙⠳⢦⣄⡀⠀⠀⠀⡷⠀⠀ ⠀"); printCount++; break;
case 21: System.out.print("  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠳⠦⠾⠃⠀⠀⠀⠀⠀"); printCount++; break;
case 23: System.out.print("                             "); printCount++; break;
}
}
else if(comState == 2) {
switch(printCount) {
case 1: System.out.print("                        "); printCount++; break;
case 3: System.out.print("    ⠀⠀⠀⠀⠀⣠⡴⠖⠒⠲⠶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 5: System.out.print("    ⠀⠀⠀⢀⡾⠁⠀⣀⠔⠁⠀⠀⠈⠙⠷⣤⠦⣤⡀⠀ "); printCount++; break;
case 7: System.out.print("    ⣠⠞⠛⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠈⢿⡀ "); printCount++; break;
case 9: System.out.print("    ⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠛⠛⠃⠸⡇⠈⣇ "); printCount++; break;
case 11: System.out.print("    ⣹⡷⠤⠤⠤⠄⠀⠀⠀⠀⢠⣤⡤⠶⠖⠛⠀⣿⠀⣿ "); printCount++; break;
case 13: System.out.print("    ⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠖⠋⢀⣿⣠⠏ "); printCount++; break;
case 15: System.out.print("    ⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀ "); printCount++; break;
case 17: System.out.print("    ⠀⠉⢿⡋⠉⠉⠁⠀⠀⠀⠀⠀⢀⣠⠾⠋⠀⠀⠀⠀ "); printCount++; break;
case 19: System.out.print("    ⠀⠀⠈⠛⠶⠦⠤⠤⠤⠶⠶⠛⠋⠁⠀⠀⠀⠀⠀  "); printCount++; break;
case 21: System.out.print("                        ");
case 23: System.out.print("                        "); printCount++; break;
}
}
else if(comState == 3) {
switch(printCount) {
case 1: System.out.print("⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠖⠒⢶⣄⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 3:System.out.print("  ⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⠀⠀⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 5:System.out.print("  ⢠⡶⠒⠳⠶⣄⠀⠀⠀⠀⠀⣴⠟⠁⠀⠀⠀⣰⠏⠀⢀⣤⣤⣄⡀⠀⠀"); printCount++; break;
case 7:System.out.print("  ⠸⡇⠀⠀⠀⠘⣇⠀⠀⣠⡾⠁⠀⠀⠀⢀⣾⣣⡴⠚⠉⠀⠀⠈⠹⡆⠀"); printCount++; break;
case 9:System.out.print("⠀  ⢻⡄⠀⠀⠀⢻⣠⡾⠋⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀⠀⠀⢀⣠⡾⠃⠀"); printCount++; break;
case 11:System.out.print("⠀  ⠀⣿⠀⠀⠀⠘⠉⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⣠⠶⠋⠁⠀⠀⠀"); printCount++; break;
case 13:System.out.print("  ⠠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⢀⣴⡿⠥⠶⠖⠛⠛⢶⡄"); printCount++; break;
case 15:System.out.print(" ⢀⣰⡇⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⢀⣠⠼⠃"); printCount++; break;
case 17:System.out.print("⠀⣿⠉⣇⠀⡴⠟⠁⣠⡾⠃⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣤⠶⠛⠉⠀⠀⠀"); printCount++; break;
case 19:System.out.print("⠀⢻⡄⠹⣦⠀⠶⠛⢁⣠⡴⠀⠀⠀⠀⠀⠀⣠⡶⠛⠉⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 21:System.out.print("⠀⠀⠻⣄⠈⢷⣄⠈⠉⠁⠀⠀⠀⢀⣠⡴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 23:System.out.print("  ⠀⠉⠳⢤⣭⡿⠒⠶⠶⠒⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
}
}
}

public static void printUserHand(String userState) {
if(userState.equals("가위") || userState.equals("1")) {
switch(printCount) {
case 2: System.out.println(""); printCount++; break;
case 4: System.out.println("                              ⠀⠀⠀⢀⣠⣤⣀⣠⣤⠶⠶⠒⠶⠶⣤⣀⠀⠀⠀          "); printCount++; break;
case 6: System.out.println("                              ⠀⢀⡴⠋⣠⠞⠋⠁⠀⠀⠀⠀⠙⣄⠀⠙⢷⡀⠀⠀        ⠀"); printCount++; break;
case 8: System.out.println("                              ⢀⡾⠁⣴⠋⠰⣤⣄⡀⠀⠀⠀⠀⠈⠳⢤⣼⣇⣀⣀⠀        "); printCount++; break;
case 10: System.out.println("                              ⢸⠃⢰⠇⠰⢦⣄⡈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠛⠛⠓⠲⢦⣄⠀⠀"); printCount++; break;
case 12: System.out.println("                              ⠸⣧⣿⠀⠻⣤⡈⠛⠳⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢻⡆⠀"); printCount++; break;
case 14: System.out.println("                               ⠈⠹⣆⠀⠈⠛⠂⠀⠀⠀⠀⠀⠀⠈⠐⠒⠒⠶⣶⣶⠶⠤⠤⣤⣠⡼⠃ "); printCount++; break;
case 16: System.out.println("                               ⠀⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠳⢦⣀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 18: System.out.println("                               ⠀⠀⠀⠈⠻⣦⣀⠀⠀⠀⠀⠐⠲⠤⣤⣀⡀⠀⠀⠀⠀⠀⠉⢳⡄⠀⠀⠀⠀"); printCount++; break;
case 20: System.out.println("                                ⠀⠀⠀⠀⠀⠉⠛⠶⠤⠤⠤⠶⠞⠋⠉⠙⠳⢦⣄⡀⠀⠀⠀⡷⠀⠀ ⠀"); printCount++; break;
case 22: System.out.println("                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠳⠦⠾⠃⠀⠀⠀⠀⠀"); printCount++; break;
case 24: System.out.println(""); printCount++; break;
}
}
else if(userState.equals("바위") || userState.equals("2")) {
switch(printCount) {
case 2: System.out.println(""); printCount++; break;
case 4: System.out.println("                                  ⠀⠀⠀⠀⠀⣠⡴⠖⠒⠲⠶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 6: System.out.println("                                  ⠀⠀⠀⢀⡾⠁⠀⣀⠔⠁⠀⠀⠈⠙⠷⣤⠦⣤⡀⠀ "); printCount++; break;
case 8: System.out.println("                                  ⣠⠞⠛⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠈⢿⡀ "); printCount++; break;
case 10: System.out.println("                                  ⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠛⠛⠃⠸⡇⠈⣇ "); printCount++; break;
case 12: System.out.println("                                  ⣹⡷⠤⠤⠤⠄⠀⠀⠀⠀⢠⣤⡤⠶⠖⠛⠀⣿⠀⣿ "); printCount++; break;
case 14: System.out.println("                                  ⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠖⠋⢀⣿⣠⠏ "); printCount++; break;
case 16: System.out.println("                                  ⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀ "); printCount++; break;
case 18: System.out.println("                                  ⠀⠉⢿⡋⠉⠉⠁⠀⠀⠀⠀⠀⢀⣠⠾⠋⠀⠀⠀⠀ "); printCount++; break;
case 20: System.out.println("                                  ⠀⠀⠈⠛⠶⠦⠤⠤⠤⠶⠶⠛⠋⠁⠀⠀⠀⠀⠀  "); printCount++; break;
case 22: System.out.println(""); printCount++; break;
case 24: System.out.println(""); printCount++; break;
}
}
else if(userState.equals("보") || userState.equals("3")) {
switch(printCount) {
case 2: System.out.println("                              ⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠖⠒⢶⣄⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 4: System.out.println("                                ⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⠀⠀⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 6: System.out.println("                                ⢠⡶⠒⠳⠶⣄⠀⠀⠀⠀⠀⣴⠟⠁⠀⠀⠀⣰⠏⠀⢀⣤⣤⣄⡀⠀⠀"); printCount++; break;
case 8: System.out.println("                                ⠸⡇⠀⠀⠀⠘⣇⠀⠀⣠⡾⠁⠀⠀⠀⢀⣾⣣⡴⠚⠉⠀⠀⠈⠹⡆⠀"); printCount++; break;
case 10: System.out.println("                              ⠀  ⢻⡄⠀⠀⠀⢻⣠⡾⠋⠀⠀⠀⠀⣠⡾⠋⠁⠀⠀⠀⠀⢀⣠⡾⠃⠀"); printCount++; break;
case 12: System.out.println("                              ⠀  ⠀⣿⠀⠀⠀⠘⠉⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⣠⠶⠋⠁⠀⠀⠀"); printCount++; break;
case 14: System.out.println("                                ⠠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠁⠀⠀⠀⢀⣴⡿⠥⠶⠖⠛⠛⢶⡄"); printCount++; break;
case 16: System.out.println("                               ⢀⣰⡇⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⢀⣠⠼⠃"); printCount++; break;
case 18: System.out.println("                              ⠀⣿⠉⣇⠀⡴⠟⠁⣠⡾⠃⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣤⠶⠛⠉⠀⠀⠀"); printCount++; break;
case 20: System.out.println("                              ⠀⢻⡄⠹⣦⠀⠶⠛⢁⣠⡴⠀⠀⠀⠀⠀⠀⣠⡶⠛⠉⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 22: System.out.println("                              ⠀⠀⠻⣄⠈⢷⣄⠈⠉⠁⠀⠀⠀⢀⣠⡴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
case 24: System.out.println("                                ⠀⠉⠳⢤⣭⡿⠒⠶⠶⠒⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"); printCount++; break;
}
}
}

public int playGame() {

Scanner sc = new Scanner(System.in);

byte comState = 0;

String userState = "0";

byte count = 0;

int credit = 1000;

boolean isEnd = false;

printAscii();

do {
System.out.println("======== 가위(1), 바위(2), 보(3) =========");
System.out.println("(------ 그만 하려면 0을 입력해주세요...------)");

userState = sc.nextLine();
comState = (byte)(Math.random() * 3 + 1);;
printCount = 1;

if( userState.equals("가위") || userState.equals("1") ) {
if(comState == 1) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 가위                                        USER : 가위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     무승부     ===========");
count = 0;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 2) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 바위                                        USER : 가위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     패배...     ===========");
count = 0;	credit -= 200;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 3) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 보                                        USER : 가위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("==========   ***승리!!! ***   ==========");
count++;	credit += 250;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
}
else if( userState.equals("바위") || userState.equals("2") ) {
if(comState == 1) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 가위                                        USER : 바위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("==========   ***승리!!! ***   ==========");
count++;	credit += 250;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 2) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 바위                                        USER : 바위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     무승부     ===========");
count = 0;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 3) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 보                                         USER : 바위");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     패배...     ===========");
count = 0;	credit -= 200;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
}
else if( userState.equals("보") || userState.equals("3") ) {
if(comState == 1) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 가위                                       USER : 보");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     패배...     ===========");
count = 0;	credit -= 200;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 2) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 바위                                        USER : 보");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("==========   ***승리!!! ***   ===========");
count++;	credit += 250;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
else if(comState == 3) {
System.out.println("\n---------------------------------------");
System.out.println("                 COM : 보                                         USER : 보");
while(printCount < 25) {
printComHand(comState);
printUserHand(userState);
}
System.out.println("===========     무승부     ===========");
count = 0;
System.out.println("    Credit : " + credit + "         연승 수 : " + count );
System.out.println("---------------------------------------\n\n");
}
}
else if(userState.equals("0")){
System.out.println("----------    종료합니다...    ----------");
isEnd = true;
}
else {
System.out.println("올바르지 않은 입력입니다.");;
}

} while(!isEnd);

return credit;

}

}