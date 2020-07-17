package java_collection.bai_tap;

import java.util.*;

public class ProductManager {
    static List<Product> lists = new ArrayList<Product>();

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhap id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap gia: ");
        int price = sc.nextInt();
        sc.nextLine();
        Product sp = new Product(id, name, price);
        lists.add(sp);
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "VND");
        }
        System.out.println("-------------------------");
    }

    public static void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhap id san pham muon sua: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Sua ten san pham thanh: ");
        String name = sc.nextLine();
        for (int i = 0; i < lists.size(); i++) {
            if (id == lists.get(i).getId()) {
                lists.get(i).setName(name);
            }
        }
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "VND");
        }
        System.out.println("-------------------------");
    }

    public static void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhap id san pham muon xoa: ");
        int id = sc.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId() == id) {
                lists.remove(i);
            }
        }
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "VND");
        }
        System.out.println("-------------------------");
    }

    public static void showProduct() {
        System.out.println();
        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "VND");
        }
        System.out.println("-------------------------");
    }

    public static void sortProduct() {
        int choose;
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Sap xep tang dan theo gia:"+"\n"+"2.Sap xep giam dan theo gia:");
        choose=scanner.nextInt();
        if(choose==1){
            Collections.sort(lists, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o1.getPrice()-o2.getPrice();
                }
            });
        }else if(choose==2){
            Collections.sort(lists, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return o2.getPrice()-o1.getPrice();
                }
            });
        }
        System.out.println(" Danh sach");
        for (Product product : lists) {
            System.out.println("id. " + product.getId() + " Name: " + product.getName() + " Price: " + product.getPrice());
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        ProductManager pro = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            System.out.println("1.Them san pham " +
                    "\n2.Sua thong tin san pham " +
                    "\n3.Xoa san pham" +
                    "\n4.Hien thi danh sach san pham " +
                    "\n5.Tim kiem san pham" +
                    "\n6.Sap xep san pham theo gia" +
                    "\n7.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pro.addProduct();
                    break;
                case 2:
                    pro.editProduct();
                    break;
                case 3:
                    pro.deleteProduct();
                    break;
                case 4:
                    pro.showProduct();
                    break;
                case 5:

                case 6:
                    pro.sortProduct();
                    break;
            }
        }
    }
}
