public class TugasStack {

 // === BAGIAN 1: Deklarasi Stack ===
 static String[] stack = new String[10];
 static int top = -1;

 // === BAGIAN 2: Operasi Stack ===

 static void push(String tiket) {
    if (top == stack.length -1){
        System.out.println("STACK PENUH!");
 } else {
    top++;
    stack[top] = tiket;
    }
 }

 // TODO: Lengkapi method pop()
 static String pop() {
    if (isEmpty()) {
        return "STACK KOSONG!";
    } else {
        String tiketTeratas = stack[top];
        stack[top]=null;
        top--;
        return tiketTeratas;
    }
 }

 // TODO: Lengkapi method peek()
 static String peek() {
    if (isEmpty()) {
        return "STACK KOSONG!";
    } else {
         return stack[top];
    }
 }

 static boolean isEmpty() {
 return top == -1;
 }

 static void tampilkanStack() {
 System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
 for (int i = top; i >= 0; i--) {
 System.out.println("| " + stack[i] + " |");
 }
 System.out.println("=================================");
 }

static void hitungTotal() {
    int total = 0;
    for (int i = 0; i<= top; i++) {
    String harga = stack[i].substring((stack[i]).indexOf("Rp") + 2);
    harga = harga.replace(".", "");
    total += Integer.parseInt(harga); 
    }
    System.out.println("Total transaksi: Rp" + String.format("%,.0f", (double) total).replace(",", "."));
}



 public static void main(String[] args) {
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        hitungTotal();

        tampilkanStack();
        System.out.println("Tiket terakhir masuk: " + peek());
        System.out.println("Tiket dibatalkan: " + pop());
        tampilkanStack();
    }
}


