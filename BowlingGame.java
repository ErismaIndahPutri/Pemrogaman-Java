package ExceptionsListThreadsFiles;

import java.util.*;

public class BowlingGame {

        HashMap<String, Integer> players;
        void Bowling() {
            players = new HashMap<String, Integer>();
        }
        public void addPlayer(String name, int p) {
            players.put(name, p);
        }
        //your code goes here
        public void getWinner() {
            String winner = "";
            int mrk = 0;
            for(String nm:players.keySet()) {
                if(players.get(nm)>mrk) {
                    winner = nm;
                    mrk = players.get(nm);
                }
            }
            System.out.println(winner);
        }
    }

    class Program {
        public static void main(String[ ] args) {
            Bowling game = new Bowling();
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<3;i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                game.equals(name, points);
            }
        }

        private static class Bowling {
            public void equals(String name, int points) {
            }
        }
    }
