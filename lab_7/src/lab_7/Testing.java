package lab_7;

public class Testing {




        public static void main(String[] args) {

            item[] itemArray = new item[3];


            itemArray[0] = new item(ProductType.BREAD, 500,"somethink" );
            itemArray[1] = new item(ProductType.fromString("Tea"),50 ,"Black Tea") ;
            itemArray[2] = new item(ProductType.MILK );

            item Bread1 = new item(ProductType.BREAD , 50);
            item Bread2 = new item(ProductType.BREAD , 300);
            item Tea1 = new item(ProductType.TEA , 20);
            item Butter1=new item(ProductType.BUTTER);
            item Milk1 = new item(ProductType.MILK , 20);
            item Bread3=new item(ProductType.BREAD,30);

            ProductType.testMe();
            System.out.println("*(1) "+itemArray[0]);
            System.out.println("*(2) "+itemArray[1]);
            System.out.println("*(3) "+itemArray[2]);
            System.out.println("#Price And Total Weight");
            System.out.println("Price (1) :"+itemArray[0].getTotalPrice());
            System.out.println("Weight (1) :"+itemArray[0].getTotalWeight());
            System.out.println("Price (2):"+itemArray[1].getTotalPrice());
            System.out.println("Weight (2) :"+itemArray[1].getTotalWeight());
            System.out.println("Price (3):"+itemArray[2].getTotalPrice());
            System.out.println("Weight (3) :"+itemArray[2].getTotalWeight());
            itemArray[0].AddItems(-600);
            itemArray[0].AddItems(-600);
            itemArray[0].AddItems(100);
            itemArray[1].remove(20);
            itemArray[2].AddItems(10);
            System.out.println("**(1) "+itemArray[0]);
            System.out.println("**(2) "+itemArray[1] );
            System.out.println("**(3) "+itemArray[2]);




            System.out.println("Price (1) :"+itemArray[0].getTotalPrice());
            System.out.println("Weight (1) :"+itemArray[0].getTotalWeight());
            System.out.println("Price (2):"+itemArray[1].getTotalPrice());
            System.out.println("Weight (2) :"+itemArray[1].getTotalWeight());
            System.out.println("Price (3):"+itemArray[2].getTotalPrice());
            System.out.println("Weight (3) :"+itemArray[2].getTotalWeight());




            System.out.println("##Equality Testing ");
            System.out.println("*Equality :"+Bread1.equals(Bread2));
            System.out.println("*Equality  :"+Bread1.equals(Tea1));
            System.out.println("Equality :"+Bread1.equals(null));




        }



    }

