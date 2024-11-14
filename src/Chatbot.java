import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        chatbot.startChat();
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm Chatbot. Type 'bye' to exit.");

        String userInput;
        do {
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();
            String response = generateResponse(userInput);
            System.out.println("Chatbot: " + response);
        } while (!userInput.equals("bye"));

        System.out.println("Chatbot: Goodbye! Have a great day.");
        scanner.close();
    }

    private String generateResponse(String input) {
        // Check for keywords and return appropriate responses
        if (input.contains("hello") || input.contains("hi")) {
            return "Hi there! How can I help you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm doing great! Thanks for asking!";
        } else if (input.contains("name")) {
            return "I’m just Chatbot, your friendly assistant!";
        } else if (input.contains("weather")) {
            return "I'm not sure, but you could check a weather website!";
        } else if (input.contains("help")) {
            return "I'm here to chat! Feel free to ask me anything!";
        } else if (input.contains("bye")) {
            return "Goodbye!";
        } else {
            return "I'm sorry, I don't understand. Could you try asking something else?";
        }
    }
}
