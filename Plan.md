План тестирования приложения V Hospice
Определение объекта тестирования
Объектом тестирования является приложение V Hospice в виде исходного кода некомпилированного приложения «Мобильный хоспис» для Android V 1.0.0 по состоянию на 16.12.2023 г.

Цели тестирования
Целями проведения тестирования является:
Определение входных требований к приложению.
Определение реализованного функционала приложения на текущем этапе разработки.
Тестирование реализованного функционала приложения на текущем этапе разработки.
Тестирование пользовательского интерфейса приложения на текущем этапе разработки.
Определение возжможного объема автоматизации тестирования приложения по результатам проведенного тестирования.
Границы приложения
Приложение будет тестироваться по следующему функционалу:

Билд приложения
Установочное тестирование приложения на заданном эмуляторе без проведения кроссплатформенного тестирования
Запуск приложения
Страница авторизации пользователя по предоставленным паре логин-пароль
Главная страница приложения
Навигация между страницами приложения
Страница Новостей
Возможность публикации новости
Возможность редактировать имеющуюся Новость
Валидация полей создания и редактирования Новости по предполагаемым или указанным критериям
Страница О Приложении
Данное приложение подвергается следующим типам тестирования:
Для отдельных полей:

Позитивное тестирование приложения (корректные данные, корректные шаги).
Негативное тестирование (введение невалидных данных, некорректные шаги).
Для всей системы:

Функциональное тестирование;
Юзабилити тестирование;
Тестирование пользовательского интерфейса.
Условия тестирования
Общие условия:
Тестирование будет проводится на ОС: Windows 10
Файл проекта fmh-android.zip
WinRAR
Android Studio
Android Gradle Plugin
Система сборки Gradle
Compile SDK
Build Tools
Espresso
Allure
Junit
Тестирование будет проводиться по чек-листу и составленным тест кейсам. Чек-лист включает в себя короткие условния проверок, тест кейс служит для проверки корректности работы полей и отдельных элементов приложения. Тестирование модуля календаря и часов на страницах Создание новости, Редактирование новости.

Тестирование пользовательского интерфейса будет проводиться :
Указанная в общих условиях конфигурация оборудования
Эмулятор Android API - Pixel 6 API 29 и тестовом смартфоне Samsung GalaxiA14
Проект приложения в виде исходного кода для среды разработки (IDE) Android Studio
Данные авторизации в приложении:
login2
password2
Потенциальные Риски
Проведение тестирования приложения невозможно по определенным условиям
Увеличение сроков проведения этапов тестирования в виду необходимости дополнительных действий, не предусмотренных данным документом
Увеличение сроков тестирования при обнаружении значительного числа дефектов (временные расходы на подтверждение, регистрацию дефектов)
План сдачи работ
Составление плана тестирования, создание чек-листа, создание тест-кейсов до 18.12.2023 г.
Настройка окружения, написание, и отладка автотестов до 08.01.2024 г.
Подготовка отчётных документов по итогам автоматизированного тестирования до 12.01.2024 г.
Подготовка отчётных документов по итогам тестирования до 14.01.2024 г.