import java.util.*;

class Chatroom{
    String name;
    Set<String> username;
    List<String> messages;

    public String getName() {
        return name;
    }

    public Set<String> getUsername() {
        return username;
    }

    public List<String> getMessages() {
        return messages;
    }


    Chatroom(){
        this.name = "";
        this.username = new HashSet<String>();
        this.messages = new ArrayList<String>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chatroom)) return false;
        Chatroom chatroom = (Chatroom) o;
        return username.equals(chatroom.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public boolean removeUser(String username) {
        if(this.username.contains(username)){
            this.username.remove(username);
            return true;
        }
        return false;
    }
}

class User{

    String username;
    String password;
    String firstName;
    String lastName;

    public User(){
        username = "";
        password = "";
        firstName = "";
        lastName = "";
    }

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}


class ChatApplication{

    Map<String, Chatroom> chatrooms = new HashMap();
    Map<String, User> users = new HashMap();
    Set<String> loggedInUsers = new HashSet();
    int chatroomCount = 0;
    int userCount = 0;
    public boolean isChatroomNameValid(String name) {
       for (Map.Entry<String,Chatroom> mp: chatrooms.entrySet()){
           Chatroom chatroom = mp.getValue();
           if(chatroom.name.equals(name)){
               return true;
           }
       }
       return false;
    }

    public boolean isUsernameExists(String username) {
        for(Map.Entry<String, User> mp: users.entrySet()){
            User user = mp.getValue();
            if(user.username.equals(username)){
                return true;
            }
        }
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        for(Map.Entry<String, User> mp: users.entrySet()){
            User user = mp.getValue();
            if(user.username.equals(username) && user.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    //UI Methods Below
    public void createChatroom() {
        Chatroom chatroom = new Chatroom();
        chatroom.messages = new ArrayList<>();
        chatroom.username = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the chatroom name: ");
        chatroom.name = sc.nextLine();

        System.out.print("Enter the chatroom username: ");
        chatroom.username.add(sc.nextLine());

        System.out.print("Enter the chatroom message: ");
        chatroom.messages.add(sc.nextLine());

        System.out.println(chatroom.getName());
        System.out.println(chatroom.getUsername());
        System.out.println(chatroom.getMessages());

        //Adding the message in map.
        chatrooms.put(Integer.toString(chatroomCount+1),chatroom);
        chatroomCount+=1;

    }

    public void addNewUser() {

        User user = new User();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        user.setFirstName(sc.nextLine());

        System.out.print("Enter the last name: ");
        user.setLastName(sc.nextLine());

        System.out.print("Enter the username: ");
        user.setUsername(sc.nextLine());

        System.out.print("Enter the password: ");
        user.setPassword(sc.nextLine());

        //Adding user in map
        users.put(Integer.toString(userCount+1),user);
        userCount +=1;

    }

    public boolean login() {

        User user = new User();
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.print("Enter the username: ");
        username = sc.next();
        System.out.println("Enter the password: ");
        password = sc.next();

        for(Map.Entry<String,User> mp: users.entrySet()){
            user = mp.getValue();
            if(user.username.equals(username) && user.password.equals(password)){
                System.out.println("LOGIN SUCCESSFUL, USERNAME AND PASSWORD MATCHED!");
                return true;
            }
        }
        return false;
    }

    public void sendMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Message: ");
        String message = sc.nextLine();

        System.out.println("Message has been sent successfully!");
        System.out.println("Message is: "+message);
    }
    public void printMessages() {
        for (Map.Entry<String,Chatroom> mp: chatrooms.entrySet()){
            Chatroom chatroom = mp.getValue();

            System.out.println("Username: "+chatroom.username);
            System.out.println("Message: "+chatroom.messages);
        }
    }

    public void listUsersFromChatroom() {
        System.out.println("All the users from the chatroom");
        for(Map.Entry<String ,Chatroom> mp: chatrooms.entrySet()){
            Chatroom chatroom = mp.getValue();
            System.out.println("username: "+chatroom.name);
        }
    }

    public void logout(){
        System.out.println("LOGOUT SUCCESSFULLY");
        System.exit(0);
    }

    public void deleteUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the username to be deleted: ");
        String username = sc.next();

        for (Map.Entry<String,User> mp: users.entrySet()){
            User user = mp.getValue();
            String key = "null";
            if(user.username.equals(username)){
                key = mp.getKey();
                break;
            }
            users.remove(key);
            System.out.println("User removed successfully!");
        }
    }

    public void deleteChatRoom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the chatroom username to be deleted: ");
        String username = sc.next();

        for (Map.Entry<String,Chatroom> mp: chatrooms.entrySet()){
            Chatroom chatroom = mp.getValue();
            String key = "null";
            if(chatroom.username.equals(username)){
                key = mp.getKey();
                break;
            }
            users.remove(key);
            System.out.println("User removed successfully!");
        }
    }


    public void menu() {

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1) Create a chatroom ");
            System.out.println("2) Add the user ");
            System.out.println("3) User login ");
            System.out.println("4) Send a message ");
            System.out.println("5) Display the messages from a specific chatroom ");
            System.out.println("6) List down all users belonging to the specified chat room. ");
            System.out.println("7) Delete an user ");
            System.out.println("8) Delete the chat room. ");
            System.out.println("9) Logout");
            System.out.println("Please enter your option:");
            choice = sc.nextInt();

            switch (choice){
                case 1: createChatroom();
                    System.out.println("ChatRoom Created Successfully!");
                    break;
                case 2: addNewUser();
                    System.out.println("New User Added Successfuly!");
                    break;
                case 3:
                    if(login()==false){
                        System.out.println("USERNAME OR PASSWORD IS INCORRECT PLEASE TRY AGAIN!");
                    }
                    break;
                case 4: sendMessage();
                break;
                case 5: printMessages();
                break;
                case 6: listUsersFromChatroom();
                break;
                case 7: deleteUser();
                break;
                case 8: deleteChatRoom();
                break;
                case 9: logout();
                break;
                default:
                    System.out.println("PLEASE ENTER THE RIGHT CHOICE!!");
            }
        }while(choice!=9);

    }
}

public class Assignment5Q6 {
    public static void main(String[] args) {
        ChatApplication chatApplication = new ChatApplication();
        chatApplication.menu();
    }
}
