import entities.Customers;
import entities.Orders;
import entities.Products;

void main(String[] args) {

    List<Customers> customersList = new ArrayList<>();
    List<Products> productsList = new ArrayList<>();
    List<Orders> ordersList = new ArrayList<>();

    Customers bill = new Customers("bill");
    customersList.add(bill);

    Customers momo = new Customers("momo");
    customersList.add(momo);

    Customers aldo = new Customers("Aldo");
    customersList.add(aldo);

    Customers giovanni = new Customers("Giovanni");
    customersList.add(giovanni);

    Customers giacomo = new Customers("Giacomo");
    customersList.add(giacomo);


    Products book1 = new Products(1111L, "diario di una schiappa", "book", 15.90);
    Products book2 = new Products(2222L, "Harry Potter e la Pietra Filosofale", "book", 14.90);
    Products book3 = new Products(3333L, "Il Nome della Rosa", "book", 120.50);
    Products book4 = new Products(4444L, "Il Piccolo Principe", "book", 9000.90);
    Products book5 = new Products(5555L, "La Divina Commedia", "book", 18.00);

    productsList.add(book1);
    productsList.add(book2);
    productsList.add(book3);
    productsList.add(book4);
    productsList.add(book5);


    Products baby1 = new Products(6666L, "Orsetto di Peluche", "baby", 19.90);
    Products baby2 = new Products(7777L, "Gioco delle Forme", "baby", 12.50);
    Products baby3 = new Products(8888L, "Mobile Musicale", "baby", 24.90);
    Products baby4 = new Products(9999L, "Copertina Morbida", "baby", 15.00);
    Products baby5 = new Products(1010L, "Succhietto Orthodontico", "baby", 8.90);

    productsList.add(baby1);
    productsList.add(baby2);
    productsList.add(baby3);
    productsList.add(baby4);
    productsList.add(baby5);


    Products boys1 = new Products(4823L, "Macchinine Hot Wheels", "boys", 9.90);
    Products boys2 = new Products(7156L, "Set Lego City", "boys", 34.90);
    Products boys3 = new Products(2947L, "Dinosauro T-Rex", "boys", 19.90);
    Products boys4 = new Products(6381L, "Pallone da Calcio", "boys", 14.90);
    Products boys5 = new Products(9204L, "Spada Laser", "boys", 24.90);

    productsList.add(boys1);
    productsList.add(boys2);
    productsList.add(boys3);
    productsList.add(boys4);
    productsList.add(boys5);

    List<Products> firstOrderProd = new ArrayList<>();
    firstOrderProd.add(book4);
    firstOrderProd.add(baby2);
    firstOrderProd.add(boys3);

    List<Products> secondOrderProd = new ArrayList<>();
    secondOrderProd.add(book3);
    secondOrderProd.add(boys1);
    secondOrderProd.add(baby4);
    secondOrderProd.add(book5);

    List<Products> thirdOrderProd = new ArrayList<>();
    thirdOrderProd.add(baby1);
    thirdOrderProd.add(book2);
    thirdOrderProd.add(boys5);

    List<Products> fourthOrderProd = new ArrayList<>();
    fourthOrderProd.add(boys2);
    fourthOrderProd.add(book5);
    fourthOrderProd.add(baby3);
    fourthOrderProd.add(boys4);

    List<Products> fifthOrderProd = new ArrayList<>();
    fifthOrderProd.add(baby5);
    fifthOrderProd.add(boys3);
    fifthOrderProd.add(book3);
    fifthOrderProd.add(baby2);


    Orders firstOrder = new Orders(firstOrderProd, momo);
    Orders secondOrder = new Orders(secondOrderProd, aldo);
    Orders thirdOrder = new Orders(thirdOrderProd, bill);
    Orders fourthOrder = new Orders(fourthOrderProd, giovanni);
    Orders fifthOrder = new Orders(fifthOrderProd, giacomo);

    ordersList.add(firstOrder);
    ordersList.add(secondOrder);
    ordersList.add(thirdOrder);
    ordersList.add(fourthOrder);
    ordersList.add(fifthOrder);

    System.out.println("///////////////////////////////// es 1 ///////////////////////////////////////");
    List<Products> highPrice = new ArrayList<>();
    highPrice = productsList.stream().filter(products -> Objects.equals(products.getCategory(), "book"))
            .filter(products -> products.getPrice() > 100).toList();
    System.out.println(highPrice);


    System.out.println("///////////////////////////////// es 2 ///////////////////////////////////////");
    List<Orders> babyOrders = new ArrayList<>();
    babyOrders = ordersList.stream()
            .filter(order -> order.getProducts().stream()
                    .anyMatch(orders -> orders.getCategory().equals("baby"))).toList();
    babyOrders.forEach(System.out::println);


    System.out.println("///////////////////////////////// es 3 ///////////////////////////////////////");
    List<Products> boysDiscount = new ArrayList<>();
    boysDiscount = productsList.stream().filter(products -> Objects.equals(products.getCategory(), "boys")).toList();
    boysDiscount.forEach(products -> {
        products.setPrice(products.getPrice() * 0.1);
    });
    boysDiscount.forEach(System.out::println);


    System.out.println("///////////////////////////////// es 4 ///////////////////////////////////////");
    LocalDate today = LocalDate.now();
     List<Orders> tierOrder= ordersList.stream().filter(orders -> orders.getOrderDate().equals(today)).toList();
     for (Orders orders:tierOrder){
         if (orders.getCustomer())
     }
}

