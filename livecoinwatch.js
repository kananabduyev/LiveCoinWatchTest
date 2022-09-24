const { Builder, By, Key, until } = require('selenium-webdriver')
const assert = require('assert')
require('chromedriver');

describe('livecoinwatch', function() {
  this.timeout(60000)
  let driver
  let vars
  beforeEach(async function() {
    driver = await new Builder().forBrowser('chrome').build()
    vars = {}
  })
  afterEach(async function() {
    await driver.quit();
  })
  it('livecoinwatch', async function() {
    await driver.get("https://www.livecoinwatch.com/")
    driver.manage().window().maximize();
    await driver.sleep(3000)
    await driver.executeScript("window.scrollTo(0,156)")
    await driver.findElement(By.css(".table-row:nth-child(1) canvas")).click()
    await driver.sleep(3000)
    await driver.findElement(By.css(".table-row:nth-child(1) .item-logo-wrap")).click()
    await driver.executeScript("window.scrollTo(0,0)")
    await driver.executeScript("window.scrollTo(0,139)")
    await driver.executeScript("window.scrollTo(0,500)")
    await driver.executeScript("window.scrollTo(0,1100)")
    await driver.findElement(By.css(".next span")).click()
    await driver.executeScript("window.scrollTo(0,1187)")
    await driver.executeScript("window.scrollTo(0,1906)")
    await driver.executeScript("window.scrollTo(0,3500)")
    await driver.executeScript("window.scrollTo(0,4700)")
    await driver.close()
  })
})
