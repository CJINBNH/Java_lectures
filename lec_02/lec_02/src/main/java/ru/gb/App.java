package ru.gb;

// import java.io.*;
// import java.io.File;

// import java.io.*;
// import java.nio.ByteBuffer;
// import java.nio.ByteOrder;
// import java.nio.charset.Charset;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;

/**
 * Hello world!
 *
 */
// public class App 
// {
    // public static void main( String[] args )
    // {
// Работа со строками

        // String[] name = {"Л", "ё", "х", "а"};
        //     String av = "АЛЕКСЕЙ ЕВ.";
        //     System.out.println(av.toLowerCase());
        //     System.out.println(String.join("", name));
        //     System.out.println(String.join("", "Л", "ё", "х", "а"));
        //     System.out.println(String.join(",", "Л", "ё", "х", "а"));

// Работа с файлами

//         String pathProject = System.getProperty("user.dir");
//         String pathFile = pathProject.concat("/file.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());

//         System.out.println(pathFile);
//         File f1 = new File("file.txt");
//         File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
//         System.out.println(f1.getAbsolutePath());
//         System.out.println(f2.getAbsolutePath());
//     }
// }

// Работа с ошибками при работе с файлами

//         String line = "empty";
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);

//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             }
//             else {
//                 System.out.println("file.existed");
//                 FileWriter fileWriter = new FileWriter(file, true);
//                 fileWriter.write("new line");

//                 //#region lineSeparator
//                 // A string containing "\r\n" for non-Unix 
//                 // platforms, or a string containing 
//                 // "\n" for Unix platforms.
//                 fileWriter.append(System.lineSeparator());
//                 //#endregion

//                 fileWriter.write("new line");
//                 fileWriter.append("new line");
//                 fileWriter.flush();
//                 fileWriter.close();
//                 // BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                 // line = bufReader.readLine();
//                 // bufReader.close();
//             }
//         } catch (Exception e) {
//             //e.printStackTrace();
//         } finally {
//             System.out.println(line);
//         }
//     }
// }

// Работа с бинарными файлами

// public class App {

//     static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
//     static Map<String, String> data = new HashMap<>();
//     static Charset charset = StandardCharsets.UTF_8;

//     static void loadFile(String path) throws IOException {
//         try (InputStream stream = 
//         new BufferedInputStream(new FileInputStream(path))) {
//             int n = readInt(stream);
//             int b1;
//             int b2;
//             byte binWord[];
//             byte binText[];
//             for (int i = 0; i < n; i++) {
//                 binWord = new byte[readInt(stream)];
//                 binText = new byte[readInt(stream)];
//                 b1 = stream.read(binWord);
//                 b2 = stream.read(binText);
//                 if (b1 != binWord.length || b2 != binText.length)
//                     throw new IOException("Error read file");
//                 data.put(new String(binWord, charset), 
//                          new String(binText, charset));
//             }
//         }
//     }

//     static void saveFile(String path) throws IOException {
//         if (data.size() == 0)
//             throw new IOException("Nothing to write");
//         try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
//             writeInt(stream, data.size());
//             byte binWord[];
//             byte binText[];
//             for (Entry<String, String> entry : data.entrySet()) {
//                 binWord = entry.getKey().getBytes(charset);
//                 writeInt(stream, binWord.length);
//                 binText = entry.getValue().getBytes(charset);
//                 writeInt(stream, binText.length);
//                 stream.write(binWord);
//                 stream.write(binText);
//             }
//         }
//     }

//     static void delete(String word) {
//         data.remove(word);
//     }

//     static void add(String word, String text) throws Exception {
//         if (data.get(word) != null)
//             throw new Exception("Word already exist");
//         data.put(word, text);
//     }

//     static String find(String word) {
//         String out = data.get(word);
//         if (out == null)
//             return "не найдено";
//         else
//             return out;
//     }

//     static int readInt(InputStream in) throws IOException {
//         byte out[] = new byte[4];
//         int i = in.read(out);
//         if (i != 4)
//             throw new IOException("Error read file");
//         return ByteBuffer.wrap(out).order(bOrder).getInt();
//     }

//     static void writeInt(OutputStream out, int num) throws IOException {
//         ByteBuffer dbuf = ByteBuffer.allocate(4);
//         dbuf.order(bOrder).putInt(num);
//         out.write(dbuf.array());
//     }

//     public static void main(String[] args) {
//         String file = "test.bin";
//         //create file
        
//         try {
//             add("key1", "значение 1");
//             add("key2", "значение 2");
//             add("key4", "значение 3");
//             saveFile(file);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         //read file
        
//         try {
//             loadFile(file);
//             String key1 = "key1";
//             String key2 = "key2";
//             String key3 = "key3";
//             System.out.printf("%s: %s\n", key1, find(key1));
//             System.out.printf("%s: %s\n", key2, find(key2));
//             System.out.printf("%s: %s\n", key3, find(key3));
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// Логирование

import java.io.IOException;
import java.util.logging.*;

public class App {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(App.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //fh.setFormatter(sFormat);
        fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}