import java.util.Scanner;
public class tictactoe{
    int winner(int user, int index, char arr[]){
        for(int i=0;i<=7;i=i+3){
            if(arr[i]==arr[i+1]&&arr[i+1]==arr[i+2]){
                if(user == 0){
                    System.out.println("User1 is winner!");
                    return 1;
                }
                else;
                System.out.println("User2 is winner!");
                return 1;
            }
        }
        for(int i=0;i<3;i++){
            if(arr[i] == arr[i+3]&&arr[i+6] == arr[i+3]){
                if(user == 0){
                    System.out.println("User1 is winner!");
                    return 1;
                }
                else;
                System.out.println("user2 is winner!");
                return 1;
            }
            if(arr[0] == arr[4]&& arr[4] == arr[8]){
                if(user == 0){
                    System.out.println("User1 is winner");
                    return 1;
                }
                else;
                System.out.println("user2 is winner!");
                return 1;
            }
        }
        return 0;
    }
    char[] board(int user, int index,char arr[]){
        if(user == 0){
            arr[index] = 'O';
        }
        if(user == 1){
            arr[index] = 'X';
        }
        for(int i=0;i<=7;i=i+3){
              System.out.println(" "+arr[i]+ " "+ "|"+arr[i+1]+ " "+"|"+arr[i+2]+" "+ " ");
            System.out.println(" "+" _"+" "+" "+" "+ " _"+" ");
        }
        return arr;
    }
    public static void main(String args[]){
        int user1 = 0;
        int user2 = 1;
        char key;
        int win = 0;
        int index = 0;
        char arr[] = {'a','b','c','d','e','f','g','h','i','j'};
        for(int i=0;i<=7;i=i+3){
             System.out.println(" "+arr[i]+ " "+ "|"+arr[i+1]+ " "+"|"+arr[i+2]+" "+ " ");
            System.out.println(" "+" _"+" "+" "+" "+ " _"+" ");
        }
        System.out.println("Welcome to tic tac toe");
        tictactoe t = new tictactoe();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
           System.out.println(i);
           if(win!=1){
            if(i%2 == 0){
                System.out.println("\n User2 turn: choose any number: ");
                key = sc.next().charAt(0);


                if(key == 'a'){
                    index = 0;
                }
                 if(key == 'b'){
                    index = 1;
                }

                if(key == 'c'){
                    index = 2;
                }
                 if(key == 'd'){
                    index = 3;
                }
                 if(key == 'e'){
                    index = 4;
                }
                 if(key == 'f'){
                    index = 5;
                }
                 if(key == 'g'){
                    index = 6;
                }
                 if(key == 'h'){
                    index = 7;
                }
                 if(key == 'i'){
                    index = 8;
                }
                arr = t.board(user2,index,arr);
                win =t.winner(user2,index,arr);
            }

  
            else{
               System.out.println("\n user1 turn: choosed any number:");
               key = sc.next().charAt(0);
                
    if(key =='a'){
        index = 0;
    }
     if(key == 'b'){
                    index = 1;
                }
                 if(key == 'c'){
                    index = 2;
                }
                 if(key == 'd'){
                    index = 3;
                }
                 if(key == 'e'){
                    index = 4;
                }
                 if(key == 'f'){
                    index = 5;
                }
                 if(key == 'g'){
                    index = 6;
                }
                 if(key == 'h'){
                    index = 7;
                }
                 if(key == 'i'){
                    index = 8;
                }
                arr = t.board(user1,index,arr);
                win = t.winner(user1,index,arr);
            }

}
else if(win == 1){
    break;
}
}
}
}
