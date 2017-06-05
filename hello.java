public   class Employee {
      private $name;

      function setName($name) {
         if ($name == "") 
           echo "Name cannot be blank!";
         else 
           $this->name = $name;
      }

      function getName() {
         return "My name is ".$this->name."<br />";
      }

   }
   interface MyInterface
   {
      function account();
      function doc();
   }

public   class Executive extends Employee implements MyInterface
   {
      private $totalStockOptions;

      function account()
      {
         echo "account";
      }

      function doc()
      {
         echo "doc";
      }
   }

public   class Assistant extends Employee implements MyInterface
   {
      function takeMemo() {
         echo "memo";
      }

      function account(){
         echo "memo";
      }

      function doc(){
         echo "Start small fire in the trash can.";
      }
   }
