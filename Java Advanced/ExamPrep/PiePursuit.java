package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class PiePursuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> contestantsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(contestantsQueue::offer);

        Deque<Integer> piePiecesStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(piePiecesStack::push);


        while(!piePiecesStack.isEmpty() && !contestantsQueue.isEmpty()) {

            Integer contestantCapacity = contestantsQueue.poll();
            Integer piePieces = piePiecesStack.pop();

            if(contestantCapacity >= piePieces) {

                int contestantPiecesLeftToConsume = contestantCapacity - piePieces;

                if(contestantPiecesLeftToConsume > 0) {
                    contestantsQueue.offer(contestantPiecesLeftToConsume);
                }


            }else{

                int piePiecesLeftToConsume = piePieces - contestantCapacity;

                if(piePiecesLeftToConsume == 1) {
                    if(piePiecesStack.size() > 1){
                        int nextPiePieces = piePiecesStack.pop();
                        piePiecesStack.push(nextPiePieces + 1);
                        continue;
                    }

                }

                piePiecesStack.push(piePiecesLeftToConsume);
            }

        }

        if(contestantsQueue.isEmpty() && piePiecesStack.isEmpty()) {
            System.out.println("We have a champion!");

        } else if (contestantsQueue.isEmpty()) {
            System.out.println("Our contestants need to rest!");
            System.out.printf("Pies left: %s", getStackElements(piePiecesStack));
            
        }else if(piePiecesStack.isEmpty()) {
            System.out.println("We will have to wait for more pies to be baked!");
            System.out.printf("Contestants left: %s", getQueueElements(contestantsQueue));


        }





    }

    private static String getStackElements(Deque<Integer> pieStack) {
        Iterator<Integer> stackIterator = pieStack.descendingIterator();
        StringBuilder sb = new StringBuilder();

        sb.append(stackIterator.next());

        while (stackIterator.hasNext()) {
            sb.append(", ");
            sb.append(stackIterator.next());
        }

        return sb.toString();
    }

    private static String getQueueElements(Deque<Integer> deque) {
        // works only for queues
        return deque.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
