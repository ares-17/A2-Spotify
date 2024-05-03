# Fork A2-Angular Spotify test

To run the tests with this fork follow the steps given in [original README](https://github.com/reverse-unina/A1-ContactList/blob/master/readme.txt).

Next, make sure that Ubuntu version 20.04 is used in the "mainOnPush" file and that each occurrence of the string 'Tesi-StrumentoGenerale' with <REPO_NAME> to properly execute github actions.

## Tips
Nel caso in cui i test non vadano a buon fine testarli allora in locale eseguendo "npm run start" in _insert-here-your-web-app/angular-spotify-main/angular-spotify-main_.

Utilizzare la funzionalità di debug dell'IDE e nel caso non fosse necessario, inserire la funzione per ottenere uno screenshot in caso di errore:
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