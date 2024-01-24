
REST-додаток для читання
ресурсу з сервера.

Retrofit2
------------
https://square.github.io/retrofit/
Типобезпечний REST-клієнт для Android та Java.
Retrofit перетворює наш HTTP API на інтерфейс Java.

OkHttp
--------
https://square.github.io/okhttp/
Ефективний HTTP та HTTP/2 клієнт для додатків
Android та Java.

Gson
------
https://github.com/google/gson
Бібліотека серіалізації/десеріалізації Java для
перетворення об'єктів Java в JSON і навпаки.

REQRES
-----------------
https://reqres.in/
Безкоштовний фейковий API для тестування та
прототипування.


1) Створюємо Maven-проект.

2) У pom.xml додаємо залежності

Retrofit
https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit

Конвертер Retrofit, який використовує Gson для серіалізації
https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson

OkHttp
https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp


3) Створюємо необхідні пакети, класи в app/.

4) Перевіримо роботу програми

GET https://reqres.in/api/users
GET https://reqres.in/api/users/4

5) Можемо подивитись залежності
View > Tool Windows > Maven
