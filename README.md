# Fork A2-Angular Spotify

[Original README](https://github.com/reverse-unina/A1-ContactList/blob/master/readme.txt)

## Configurazione fork
La creazione di un fork del repository originale risulta tediosa e non pronta all'uso a causa della presenza di referenze a path assoluti o nome del repository.

Per avere un fork _pronto all'uso_ seguire i passaggi che compongono _execute_all_tests.py_, descritti in [Locators-automated-tests](https://github.com/ares-17/locators-automated-tests).

## Locators-automated-tests
Di default per eseguire un test occorre:
- creare il test con Katalon Recorder ed esportarlo in _project-test-headless/src/test/java/com/example/TesiIntegrazioneProgettoEsterno_ sottoforma di junit
- aggiungere eventuali modifiche al frontend Angular per testare le proprietà del test
- creare una commit e push per eseguire le azioni di Github
- creare una release a seguito dell'esecuzione delle azioni prima menzionate
- scaricare il file zip della release ed ispezionare la cartella _TestSuite_

Il repository **Locators-automated-tests** prima menzionato, automatizza il processo descritto utilizzando dei tag presenti nel repository originario e che identificano delle modifiche apportate al FE Angular per testare i file junit di test.

Se si intende eseguire un file di test per tutti i tag e confrontarne le proprietà, basta semplicemente clonare il repository dei test automatici in _automated-test_ come quanto indicato nel proprio README.

## Esecuzione test in locale
Nel caso in cui i test non vadano a buon fine testarli allora in locale eseguendo **npm run start** in _insert-here-your-web-app/angular-spotify-main/angular-spotify-main_ ed eseguire la funzionalità di debug integrata nell'IDE.

### Cattura screenshot in caso di errore

```java
@Test
  public void my_test() throws Exception{
    try{
        // test body
    } catch(Exception e){
        takeScreenshot(driver, "error_screenshot.png");
    }
  }

  public void takeScreenshot(WebDriver driver, String filePath) {
    File screenshotFile = ((TakesScreenshot) driver)
        .getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(screenshotFile, new File(filePath));
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```
### Generazione report finale in locale
Per generare un unico report (in locale non utilizzando l'action su Github) a partire dai numeri file .xls generati è necessario:
- Aver installato una versione minima di Java 8 col _JAVA_HOME_ configurato
- Estrarre il contenuto di _unisciReportExcel_
- Posizionare i file .xls in _unisciReportExcel/surefire_reports_ eliminando altri eventuali file presenti
- posizionarsi con il terminale nella cartella _target_ ed eseguire `java -jar unisciReportExcel-0.0.1-jarReportTest.jar ./surefire-reports reportComplessivo`