import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class VoterRegistrationSubsystem {
    public void registerVoters() {
        System.out.println("Registering voters");
    }
}

class CandidateRegistrationSubsystem {
    public void registerCandidates() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter candidate's name here: ");
            String name = scanner.nextLine();
            System.out.println("Candidate " + name + " registered");
        }
    }
}

class BallotCreationSubsystem {
    public void createBallot() {
        System.out.println("Creating the ballot");
        // You can add implementation for creating the ballot here
    }
}

class VotingProcessSubsystem {
    private Map<String, Integer> candidateVotes;

    public VotingProcessSubsystem() {
        this.candidateVotes = new HashMap<>();
    }

    public void handleVoting() {
        try (Scanner scanner = new Scanner(System.in)) {
    
            while (true) {
                System.out.println("Enter the candidate number you want to vote for (1 for Candidate 1, 2 for Candidate 2, or type 'done' to finish voting): ");
    
                // Check if there is input available
                int input = scanner.nextInt();
    
    
                    switch (input) {
                        case "1":
                            // Increase the vote count for Candidate 1
                            candidateVotes.put("Candidate 1", candidateVotes.getOrDefault("Candidate 1", 0) + 1);
                            System.out.println("Vote recorded for Candidate 1");
                            break;
                        case "2":
                            // Increase the vote count for Candidate 2
                            candidateVotes.put("Candidate 2", candidateVotes.getOrDefault("Candidate 2", 0) + 1);
                            System.out.println("Vote recorded for Candidate 2");
                            break;
                        case "done":
                            return;
                        default:
                            System.out.println("Invalid input. Please enter 1 for Candidate 1, 2 for Candidate 2, or 'done' to finish voting.");
                            break;
                    }
                }
            
        return candidateVotes;
    }
}
    


class ResultTabulationSubsystem {
    public void tabulateResults(Map<String, Integer> candidateVotes) {
        System.out.println("Tabulating the results");
        // Implementation for tabulating the results
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }
}

// Facade class
class ElectionFacade {
    private VoterRegistrationSubsystem voterRegistration;
    private CandidateRegistrationSubsystem candidateRegistration;
    private BallotCreationSubsystem ballotCreation;
    private VotingProcessSubsystem votingProcess;
    private ResultTabulationSubsystem resultTabulation;

    public ElectionFacade() {
        this.voterRegistration = new VoterRegistrationSubsystem();
        this.candidateRegistration = new CandidateRegistrationSubsystem();
        this.ballotCreation = new BallotCreationSubsystem();
        this.votingProcess = new VotingProcessSubsystem();
        this.resultTabulation = new ResultTabulationSubsystem();
    }

    public void conductElection() {
        voterRegistration.registerVoters();
        candidateRegistration.registerCandidates();
        ballotCreation.createBallot();
        votingProcess.handleVoting();
        resultTabulation.tabulateResults(votingProcess.getCandidateVotes());
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        ElectionFacade electionFacade = new ElectionFacade();
        electionFacade.conductElection();
    }
}
