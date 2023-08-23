public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello and welcome!");

        /*
        Tamsayılar
        Javada 4 adet tam sayı tipi vardır bunlar "byte","short,"int" ve "long" dur.
         */

        //byte

        /**
         En küçük veri tipidir. bellekte 8-bit yer kaplar. bu 8-bitlik alanda 2**8 =256 farklı değer tutabiliriz
        fakat Java dilinde tüm sayı tipleri işaret bilgisini de içerir. Bu nedenle bu bitlerden bir tanesi işaret
        bilgisi tutmak için ayrılır. Dolayısı ile Java dilinde byte  veri tipini kullanan değişkenler -2**7 ile 2**7 -1
        arasında (yada başka bir ifadeyle -128 ile 127 arasında) değerler alabilir. byte veri tipi Byte sınıfı ile
        karıştırılmamalıdır. Byte sınıfı ilerde incelenecektir. byte veri tipinin kullanımı aşağıdadır
        **/
        byte a1 = 127;
        byte b1 = -128;
        //byte c = 130;
        System.out.println(a1);
        System.out.println(b1);
        //System.out.println(c);

        //SHORT

        /**
          Bu veri tipi kısa veri tiplerini tutabilmek için tasarlanmıştır. Java dilinde short veri tipi bellekte 16-bitlik
         yer tutar. Dolayısıyla short tipinde tanımlanmış değişkenler -32768 ile 32767 arasında değerler alabilir.
         Short veri tipinin kullanımı aşağıdadır
         **/

        short x = -32768;
        short y = 3276;
        //short z = -32769;
        System.out.println(x);
        System.out.println(y);
        //System.out.println(z);

        //İNT

        /**
          Bu veri tipi orta uzunluktaki verileri tutmak için tasarlanıştır. Ayrıca en çok kullanılan veri tiplerinden bir
         tanesi olan int bellekte 32-bitlik ver tutar. Bu tipr sahip değişkenler -2147483648 ile 2147483647 arasında
         değerler alabilir.
         **/

        int k = -2147483648;
        int l = 2147483647;
        //int m = 2147483648;
        System.out.println(k);
        System.out.println(l);
        //System.out.println(m);

        //LONG

        /**
          Bu veri tipi çok uzun tamsayıları tutmak için tasarlanmıştır. Eğer programımızda kullanacağımız sayılar yaklaşık
         2 milyardan büyükse bu veri tipinden değişkene ihtiyacımız var demektir. Java stanartlarına göre bu veri bellekte
         64-bitlik bir alanda depolanır bu tipe sahip değişkenler -9223372036854775808 ile 9223372036854775807 arasındaki
         sayıları tutabilir
         **/

        long k2 = -9223372036854775808l;
        System.out.println(k2);


        /*
        Ondalıklı(Kayar noktalı) sayılar

         Bu veri tipleri ondalıklı sayılarrı tutmak i.in tasarlanmıştır. Java dilinde float ve double olmak üzere iki farklı
         ondalıklı sayı tipi vardır.
         */

        //FLOAT (TEK DUYARLI)

        /**
          Float veri türü Double veri türüne göre daha az bir aralıkla ve daha az kesinlikte ondalıklı sayıları tutabilmesine
         karşın bellekte double  veri tipinin yarısı kadar, 32-bit, yer kaplar. Float veri tipine sahip değişkenler  -3.4x10**38
         ile 3.4x10**38 arasında değer alabilir ve bu değişkenler ondalıklı sayılar için virgülden sonra 7 haneye kadar duyarlıklıdır
         Dolayısıyla float veri tipi double veri tipine göre daha sıklıkla kullanılır
         **/

        //FLOAT veri tipiyazılırken sonuna "F" eklenir.
        float a2 = 2.1234567F;
        System.out.println(a2);

        //DOUBLE (ÇİFT DUYARLI)

        /**
          double veri tipine sahip değişkenler bellekte 64 bit yada başka biir değişle 8 bayt yer tutarlar. Bu tipten
         değişkenler gloat veri tipine sahip değişkenlerin yatmediği zamanlarda yardımımıza koşarlar. Double veri
         tipine sahip değişkenlerde -1.7x10**308 ile 1.7x10**308 arasındaki sayıların nokltadan sonra 17 haneye kadar
         duyarlılıkla depolayabliriz.
         **/

        double b2 = 25.23402324223d;

        //CHAR

        /**
          Java'da chaar veri tipi karakterleri temsil eder. Bu veri tipine tanımlanmış değişkenler bellekte 16-bit yer
         kaplar. Aslında char veri tipi bir işaretsiz tamsayı değerine sahiptir ve bu tamsayılar unicode karakter setinde
         özel karakterlere karşılık gelirler. Karakter değerler tam sayı olarak yorumlandığından dolayı bu veri tipine
         sahip değişkenlerle çeşitli aritmatik işlemler ve büyüktür, küçüktür gibi karşılaştırmalar yapılabilir**/

        char a3 = '9';
        char b3 = '3';
        System.out.println(a3 <= b3);


        //BOOLEAN

        /**
          boolean veri tipi sadece iki farklı değer alabilir: true/false. Bu ifadeler genellikle mantıksal işlemlerin
         sonuçlarını tutmak icin kullanılır. Eğer bu mantıksal işlemin sonucu doğru ise true; yanlış ise flase değerini
         alır. Bu tipten değişkenlerin incelendiği bir kod bloğu aşağıda verilmiştir
         **/

        int a = 5, b = 6;
        boolean var1 = a<b;
        boolean var2 = a>b;
        System.out.println(var1);
        System.out.println(var2);


        //!!!NOT!!!

        /**
          INTEGAR ve INT arasındaki fark

         int "primitif" bir veri tipidir. Intager ise bir nesnedir.Intager bir nesne olduğu için bu tipten değikenler null
         değerini alabilir fakat int değişkenlere null değeri veremezsiniz. Inatager tipindeki değişkenler java.lang.Intager
         sınıfındaki metodlerı kullabilirler, int tipindeki değişkenler ise bunu kullanamazlar . Intager tipindeki değişkenleri
          bir vektör ya da Kolleksiyon içerisinde tutabilirsiniz  yada HashMap için anahtar olarak kullanabilirsiniz.
         **/

        //Primıtif veri tiplerinin varsayılan değerleri

        //byte =     0
        //short =    0
        //int =      0
        //long =     0L
        //float =    0.0f
        //double =   0.0d
        //char =     '\u0000
        //boolean =  false

        //LİTERALLER (DEĞERLER)

        /**
          Literaller primitif değişkenlerin aldığı değerler olarak tanımlanır. Bir önceki bölümde primitif değişkenlerden
         ve bu değişkenlerin varsayılan değerlerinden bahsettik. bu değişkenlerin varsayılan değerlerinin verildiği tabloda
         L,d ve f gibi harfler dikkatiniz çekmiştir. Farklı tipteki değişkenler aynı değeri alabildiğinden karışıklık
         olmaması amıcayla bu önlem alınmıştır **/

        //Tamsayı (int) Litareller

        /**
          Tamsayı litaraller için çeşitli gösterimler mevcuttur. Bu tipten değerler 10'luk 8'lik ve 16'lık tabanda
         gösterilebilir. Syıyı 8'lik tabanda gösterbilmek için sayının 8'lik tabandaki karşılığının önüne 0 eklemek,
         sayıyı 16'lık tabanda gösterebilmek için ise sayılık 16'lık tabandaki karşılığının önüne 0x karakterlerini
         eklemek gerekmektedir **/

        //Ondalık tabanda: 27
        //Octal(sekizlik) tabande: 033
        //Hexadecimal (onaltılık) tabanda: 0x1b


        //String kullanımı

        String s1 = "Merhaba";
        String s2 = "Java";
        String s3 = s1 + " " + s2 + " " ;
        String s4 = s3 + "Progrmlama Dili";
        System.out.println(s4);

        //StringBuffer

        String s5 = "Merhaba" + "Java";
        String s6 = new StringBuffer().append("Merhaba ").append("Java").toString();
        System.out.println(s5);
        System.out.println(s6);




    }
}