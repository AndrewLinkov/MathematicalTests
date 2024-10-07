https://www.youtube.com/watch?v=-7B7TaYnwQY&t=1081s

1. 
2. Присвоить им аннотации Regress Smoke.
3. Посмотреть как ведет себя джоба, будет ли она статична? или каждый раз ее обновлять
4. Отработать методичку
5. Попробовать удалить джобу



1. Подключить библиотеки Allure  и плагины
2. Настроить проперти
3. В классе BaseTest прописать строку: SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
4. Алгоритм запуска отчета:
- Запустить тесты
- Allure:report - сформировать отчет
- Allure:serve - отобразить отчет