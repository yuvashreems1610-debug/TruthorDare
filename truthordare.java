
import java.util.Scanner;
import java.util.Random;
class truthordare{
    public static void main(String[]args){
        System.out.println("Game: Truth or Dare");
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of players:");
        int numberOfPlayers=sc.nextInt();
        sc.nextLine();
        String[] playerNames=new String[numberOfPlayers];
        for(int i=0;i<numberOfPlayers;i++){
            System.out.print("Name of player "+(i+1)+" : ");
            playerNames[i]=sc.nextLine(); 
        }
        System.out.print("Category(kids/adults):");
        String Category=sc.nextLine();
        while(true){
            if(Category.equalsIgnoreCase("kids")|| Category.equalsIgnoreCase("adults")){
                break;
            }else{
                System.out.print("Please choose either the Kids/Adults Category: ");
                Category=sc.nextLine();
            }
        }
        String[] kidsTruth = {
        "What is your funniest childhood memory?",
        "What is your favourite cartoon?",
        "Have you ever talked to your toys?",
        "What is your favourite food?",
        "Have you ever blamed someone else for your mistake?",
        "What is the silliest thing you have ever done?",
        "Which superhero would you like to become?",
        "Have you ever danced when nobody was watching?",
        "What is your biggest fear?",
        "What is your favourite subject?",
        "Have you ever fallen asleep in class?",
        "What is the funniest nickname you have?",
        "If you could have any pet, what would it be?",
        "Have you ever eaten sweets before dinner secretly?",
        "Who makes you laugh the most?",
        "What is your dream job?",
        "Have you ever forgotten your homework?",
        "What is your favourite game?",
        "If you could travel anywhere, where would you go?",
        "What is the weirdest food combination you enjoy?",
        "Have you ever sung in the bathroom?",
        "Which cartoon character are you most like?",
        "What is something you are afraid to tell your parents?",
        "Have you ever laughed at the wrong time?",
        "What is your favourite festival?",
        "If you could become invisible for one day, what would you do?",
        "What is the funniest dream you remember?",
        "Have you ever hidden food from someone?",
        "Who is your best friend?",
        "What is one thing you cannot live without?",
        "Have you ever made a funny face in front of a mirror?",
        "Which animal would you like to talk to?",
        "What is your favourite ice cream flavour?",
        "Have you ever pretended to be sick to avoid school?",
        "What is the most embarrassing thing that happened at school?",
        "If you had a million rupees, what would you buy first?",
        "What is your favourite song?",
        "Have you ever laughed so much that your stomach hurt?",
        "What is one thing you wish you could learn?",
        "What is the funniest thing your teacher has said?",
        "If you could switch lives with anyone for a day, who would it be?",
        "Have you ever been caught doing something naughty?",
        "What is your favourite thing about your family?",
        "Which fictional character would you invite to your birthday?",
        "What is the strangest dream you have had?",
        "Have you ever forgotten someone's name immediately after meeting them?",
        "What is your favourite outdoor activity?",
        "If you could invent something, what would it be?",
        "What makes you instantly happy?",
        "What is one secret talent you have?"
        };

        String[] kidsDare = {
        "Dance for 20 seconds without music.",
        "Sing your favourite song.",
        "Make five funny facial expressions.",
        "Walk like a penguin for 30 seconds.",
        "Imitate your favourite cartoon character.",
        "Speak like a robot for one minute.",
        "Do 10 jumping jacks.",
        "Pretend to be a cat for 30 seconds.",
        "Say the alphabet backwards as far as you can.",
        "Balance a book on your head for 20 seconds.",
        "Tell a joke and make everyone laugh.",
        "Act like a monkey for 20 seconds.",
        "Sing a song in a funny voice.",
        "Spin around three times and walk straight.",
        "Make up a short poem.",
        "Pretend to be a news reporter.",
        "Try to touch your nose with your tongue.",
        "Do your funniest dance move.",
        "Speak without closing your mouth for 20 seconds.",
        "Draw a house with your eyes closed.",
        "Imitate a famous person.",
        "Say five tongue twisters quickly.",
        "Pretend the floor is made of lava for 20 seconds.",
        "Act like a sleepy bear.",
        "Make an animal sound and let others guess.",
        "Walk backwards for 10 steps carefully.",
        "Sing Happy Birthday like an opera singer.",
        "Pretend to be a superhero saving the world.",
        "Tell a story using only five words.",
        "Do your best baby voice.",
        "Make a funny handshake with another player.",
        "Try to juggle two soft objects.",
        "Act like a robot whose battery is low.",
        "Say your name in a singing voice.",
        "Pretend to be a chef describing an imaginary dish.",
        "Do a slow-motion run.",
        "Make a funny advertisement for a pencil.",
        "Laugh continuously for 15 seconds.",
        "Act like you are walking on the moon.",
        "Pretend to be a teacher taking attendance.",
        "Make a funny face and hold it for 15 seconds.",
        "Try to whistle your favourite tune.",
        "Say a sentence without using the letter 'A'.",
        "Pretend to be a dinosaur.",
        "Do five squats.",
        "Act out your favourite movie scene.",
        "Make up a new dance step.",
        "Speak in a whisper for one minute.",
        "Give everyone a funny compliment.",
        "Tell a story with three random words chosen by other players."
        };

        String[] adultsTruth = {
        "What is the biggest lie you have ever told?",
        "Have you ever had a secret crush on someone in this room?",
        "What is your most embarrassing moment?",
        "Have you ever stalked someone's social media profile?",
        "What is one thing you regret doing?",
        "Have you ever pretended to like someone?",
        "Who was your first crush?",
        "What is the most childish thing you still do?",
        "Have you ever sent a message to the wrong person?",
        "What is your biggest insecurity?",
        "Have you ever lied to escape a situation?",
        "What is the weirdest thing you have searched online?",
        "Have you ever been jealous of a friend?",
        "What is one secret you have never shared with anyone?",
        "Have you ever fallen in love at first sight?",
        "What is the worst excuse you have ever given?",
        "Have you ever been caught lying?",
        "What is your biggest pet peeve?",
        "Who in this room knows you the best?",
        "What is the most embarrassing thing in your search history?",
        "Have you ever had a crush on a friend's sibling?",
        "What is one thing you would change about your past?",
        "Have you ever ignored someone's call intentionally?",
        "What is the most awkward date you have experienced?",
        "Have you ever judged someone before knowing them?",
        "What is your biggest fear about the future?",
        "Have you ever pretended to be busy to avoid someone?",
        "What is the most expensive thing you regret buying?",
        "Have you ever broken someone's trust?",
        "What is one habit you want to get rid of?",
        "Have you ever had feelings for two people at once?",
        "What is the strangest dream you have had about someone you know?",
        "Have you ever secretly read someone else's messages?",
        "What is the funniest rumour you have heard about yourself?",
        "What is one thing you are too shy to admit?",
        "Have you ever lied about your age?",
        "Who would you call first in an emergency?",
        "What is the most spontaneous thing you have ever done?",
        "Have you ever regretted a friendship?",
        "What is your biggest relationship red flag?",
        "Have you ever pretended to understand something when you didn't?",
        "What is one thing you wish people understood about you?",
        "Have you ever had an awkward encounter with your ex?",
        "What is the most ridiculous reason you have argued with someone?",
        "Have you ever developed a crush on a fictional character?",
        "What is something you would never do again?",
        "Have you ever secretly celebrated when someone cancelled plans?",
        "What is the most embarrassing nickname someone has given you?",
        "If you could know one person's honest opinion about you, whose would it be?",
        "What is one truth about yourself that surprises people?"
        };

        String[] adultsDare = {
        "Dance without music for 30 seconds.",
        "Sing a song chosen by the group.",
        "Imitate another player until someone guesses who it is.",
        "Speak in an accent for the next three rounds.",
        "Let the group choose a funny nickname for you for the next 10 minutes.",
        "Do your best celebrity impression.",
        "Give a dramatic movie-style dialogue.",
        "Act like you are proposing to an imaginary person.",
        "Try to make everyone laugh in 30 seconds.",
        "Speak only in questions for the next two rounds.",
        "Do a runway walk across the room.",
        "Recreate your favourite movie scene.",
        "Give a motivational speech about a completely useless object.",
        "Sing a romantic song dramatically.",
        "Try to rap for 30 seconds.",
        "Pretend to be a news reporter covering this game.",
        "Let another player choose a tongue twister for you.",
        "Make a funny advertisement for your shoes.",
        "Talk like a villain for one minute.",
        "Tell a joke without laughing.",
        "Do your best dance move.",
        "Act like you are receiving an Oscar.",
        "Describe your day like a movie trailer.",
        "Try to imitate three different animal sounds.",
        "Give a compliment to every player.",
        "Speak in slow motion for one minute.",
        "Pretend to be a strict school principal.",
        "Let the group give you three random words and make a story.",
        "Do 15 squats.",
        "Sing the alphabet like a love song.",
        "Act like you are meeting your favourite celebrity.",
        "Try to pronounce a difficult tongue twister three times.",
        "Give a funny weather report.",
        "Pretend to be a fitness trainer for 30 seconds.",
        "Perform a dramatic emotional scene.",
        "Make up a short song about the person sitting next to you.",
        "Try to dance like a famous singer.",
        "Talk like a customer service representative.",
        "Pretend to be a stand-up comedian for one minute.",
        "Describe yourself using only three funny words.",
        "Do your best evil laugh.",
        "Act like you are stuck in an elevator.",
        "Try to sell an imaginary product to everyone.",
        "Recreate your reaction to seeing your exam results.",
        "Speak without using the words 'yes' or 'no' for two rounds.",
        "Pretend to be a famous influencer recording a vlog.",
        "Make a funny face and hold it for 20 seconds.",
        "Give a dramatic speech about why sleep is important.",
        "Let another player choose a song for you to sing.",
        "Perform a 30-second comedy show."
        };

        String Continue="next";
        while(true){
            if(Continue.equalsIgnoreCase("next")){


            Random r = new Random();
            int index = r.nextInt(numberOfPlayers);
            System.out.println(playerNames[index]+"'s Turn");
            System.out.print("Choose Truth or Dare : ");
            String choice=sc.nextLine();
            int[] visitedKidsTruth=new int[50];
            int[] visitedAdultsTruth=new int[50];
            int[] visitedKidsDare=new int[50];
            int[] visitedAdultsDare=new int[50];
                while(true){
                    if(choice.equalsIgnoreCase("truth")){
                        if(Category.equalsIgnoreCase("kids")){
                            while(true){
                                int kidsTruthIndex = r.nextInt(kidsTruth.length);
                                if(visitedKidsTruth[kidsTruthIndex]==0){
                                    System.out.println("Question is "+kidsTruth[kidsTruthIndex]);
                                    visitedKidsTruth[kidsTruthIndex]=1;
                                    break;
                                }
                                else{
                                    kidsTruthIndex = r.nextInt(kidsTruth.length);
                                } 
                            }
                        }
                        else {
                            int adultsTruthIndex = r.nextInt(adultsTruth.length);
                            System.out.println("Question is "+adultsTruth[adultsTruthIndex]);
                        
                        }
                        break;
                
                    }
                
                    else if(choice.equalsIgnoreCase("dare")){
                    
                        if(Category.equalsIgnoreCase("kids")){
                            int kidsDareIndex = r.nextInt(kidsDare.length);
                            System.out.println("Dare is "+kidsDare[kidsDareIndex]);

                        }
                        else {
                            int adultsDareIndex = r.nextInt(adultsDare.length);
                            System.out.println("Dare is "+adultsDare[adultsDareIndex]);
                            
                        }
                        break;
                
                    }
                    else{
                        System.out.println("You can only choose between truth or dare");
                        System.out.print("Choose Truth or Dare : ");
                        choice=sc.nextLine();
                    }
                }
                
                System.out.print("To move on to nxt person enter next or to end game enter end : ");
                Continue=sc.nextLine();
               
            
            }
            else if(Continue.equalsIgnoreCase("end")){
                System.out.println("GAME OVER!!!");
                break;
            }
            else{
                System.out.println("Enter valid options");
                System.out.print("To move on to next person enter next or to end game enter end : ");
                Continue=sc.nextLine();
            }

        }
    }
}
