//Practice1
    try (FileInputStream fis = new FileInputStream(filePath)) {
        int data;
        // Чтение байтов из файла
        while ((data = fis.read()) != -1) {
            // Выводим каждый байт в виде символа
            System.out.print((char) data);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
//Practice2
    try (FileOutputStream output = new FileOutputStream("out.txt", true)) {
        // Запись числа в файл
        output.write(30);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
//Practice3
// Reader и Writer обеспечивают работу с текстовыми данными (символами) вместо байт,
// предоставляя поддержку различных кодировок.

//Practice4
    try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
// Интерфейс AutoCloseable позволяет автоматическое освобождение ресурсов в блоке try-with-resources.