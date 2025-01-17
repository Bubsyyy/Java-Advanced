package _03_Sets_And_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            Map<String, LinkedHashMap<String, Integer>> messagesInfo = new TreeMap<>();

            while (!input.equals("end")) {
                String ip = input.split("\\s+")[0].split("\\=")[1];
                String message = input.split("\\s+")[1].split("\\=")[1];
                String user = input.split("\\s+")[2].split("\\=")[1];

                messagesInfo.putIfAbsent(user, new LinkedHashMap<>());
                LinkedHashMap<String, Integer> ipInfo = messagesInfo.get(user);

                if (!messagesInfo.containsKey(user)) {
                    ipInfo.put(ip, 1);
                } else {
                    if (!ipInfo.containsKey(ip)) {
                        ipInfo.put(ip, 1);
                    } else {
                        ipInfo.put(ip, ipInfo.get(ip) + 1);
                    }
                }

                input = scanner.nextLine();
            }

            for (var entry : messagesInfo.entrySet()) {
                System.out.println(entry.getKey() + ": ");
                LinkedHashMap<String, Integer> messageIP = entry.getValue();


                int count = 1;
                for (var innerMap : messageIP.entrySet()) {
                    String output = String.format(count < messageIP.entrySet().size() ? "%s => %d, " : "%s => %d.%n", innerMap.getKey(), innerMap.getValue());
                    System.out.printf("%s", output);
                    count++;
                }
            }

        }
    }
