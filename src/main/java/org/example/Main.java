package org.example;
/*   1)შექმენით აბსტრაქტული კლასი, რომელსაც ექნება ერთი აბსტრაქტული მეთოდი სახელად
countVowel. შემდეგ შექმენით შვილი კლასი, რომელიც ამ აბსტრაქტულ მეთოდს გაუკეთებს
ოვერაიდინგს, ანუ შვილ კლასში გაიწერება ამ მეთოდის ლოგიკა.
ბოლოს კი მეინ კლასში შექმენით ამ შვილი კლასის ობიექტი, რომელიც გამოიძახებს
countVowel მეთოდს, რომელიც არგუმენტის სახით მიიღებს სტრინგს და დაბეჭდავს ამ
სტრინგში არსებული ხმოვანების რაოდენობას.
მაგალითად თუ გადავეცით სტრინგი Hello, უნდა დაიბეჭდოს “ამ სტრიქონში არის 2
ხმოვანი ”, რადგან 2 ხმოვანია. თუ გადავეცი სტრინგი I love testing, უნდა დაიბეჭდოს “ამ
სტრიქონში არის 5 ხმოვანი ”, რადგან მართლა 5 ხმოვანია.*/




public class Main {
    public static void main(String[] args) {
        CountVowelSubClass object1 = new CountVowelSubClass();

        String mystring1 = "Hello",
                mystring2 = "I Love Testing";

        String str1 = "Hello",
                str2 = "I Love Testing";

        System.out.println("ამ სტრინგში არის " + object1.countVowel(mystring1) + " ხმოვანი");
        System.out.println("ამ სტრინგში არის " + object1.countVowel(mystring2) + " ხმოვანი");

        System.out.println("ამ სტრინგში არის " + object1.countVowel1(str1) + " ხმოვანი");
        System.out.println("ამ სტრინგში არის " + object1.countVowel1(str2) + " ხმოვანი");

     /*   2)შექმენით ორი ინტერფეისი, პირველ ინტერფეისში შექმენით მეთოდი replaceSymbolA და
მეორე ინტერფეისში შექმენით მეთოდი replaceSymbolB. შემდეგ შექმენით კლასი, რომელიც ორივე ინტერფეისს ერთდორულად გაუკეთებს
იმპლემენტაციას.ბოლოს კი მეინ კლასში შექმენით ამ კლასის ობიექტი, რომელიც გამოიძახებს
replaceSymbolA და replaceSymbolB მეთოდებს, რომლებიც არგუმენტის სახით მიიღებენ
String -ს და პირველი მეთოდი შეცვლის ყველა a ასოს z -ით, ხოლო მეორე მეთოდი ყველა b
ასოს შეცვლის w -ით. მაგალითად, თუ პირველი მეთოდი მიიღებს ტექსტს Lela, უნდა დაბეჭდოს Lelz, ხოლო თუ
მეორე მეთოდი მიიღებს ტექსტს Gabelaia, უნდა დაბეჭდის Gawelaia.
მინიშნება, String -ში უკვე არსებული replace მეთოდით მარტივად გაართმევთ თავს ამ
ამოცანას.*/


        ReplaceSymbolClass object2 = new ReplaceSymbolClass();
        String replaceA = "lela";
        object2.replaceSymbolA(replaceA);
        String replaceB = "Gabelaia";
        object2.replaceSymbolB(replaceB);

        /* 3)ზრდადობით დალაგეთ შემდეგი int ტიპის მასივი int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89}.
არ გამოიყენოთ sort ან რამე სხვა ჯავას მეთოდი და თქვენით დაალაგეთ მასივი
ზრდადობით. პირდაპირ main მეთოდში იმუშავეთ, დაალაგეთ მოცემული მასივი ზრდადობით და ბოლოს
დაბეჭდეთ ამ მასივში არსებული ელემენტები.
კარგად საფიქრალი ამოცანა არის და არ არის მარტივი. შეიძლება for -ში მეორე for -ის
გამოყენებაც დაგჭირდეთ და კარგად მოიფიქრეთ. */

        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for (int i = 0; i < arr.length - 1; i++) {
           for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

