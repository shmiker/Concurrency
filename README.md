# Concurrency
 Реализовать многопоточное приложение на языке Java 8.  В приложение должно быть реализовано два потока:  1. Первый поток считывает введённые с клавиатуры числительные на английском языке (от one до nine thousand nine hundred ninety nine) и помещает их в память.  2. Второй поток обращается к памяти один раз в пять секунд, извлекает (удаляет его из памяти) самое маленькое из записанных чисел и выводит его на экран.  Задачу запрещается решать с помощью имеющихся потокозащищённых коллекций из пакета java.util.concurrent и других специальных библиотек от сторонних разработчиков.
