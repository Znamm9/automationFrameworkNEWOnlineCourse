#Test automation Framework for online course



##### Якщо хочеш запустити через maven на інший URL використовуй системну змінну env
приклад:
```bash
mvn -Denv=qa2 test
```


##### Якщо хочеш запустити через maven в повільному режимі використовуй системну змінну slow_mo=300 де 300 час в мілісекундах
приклад:
```bash
mvn -Dslow_mo=300 test
```