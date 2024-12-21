try (Scanner scan = new Scanner(new FileReader("input.txt"))) {
        // Читаем файл построчно
        while (scan.hasNextLine()) {
String line = scan.nextLine();
        System.out.println(line);
    }
            } catch (FileNotFoundException e) {
        System.err.println(e);
}