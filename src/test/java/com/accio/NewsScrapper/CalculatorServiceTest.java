package com.accio.NewsScrapper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.accio.NewsScrapper.service.CalculatorService;

//@SpringBootTest
public class CalculatorServiceTest {

//  @Autowired
//  private CalculatorService calculatorService;

  @BeforeAll
  public static  void beforeAll(){
    System.out.println("Before All");
  }

  String response="{\n"
      + "    \"status\": \"ok\",\n"
      + "    \"totalResults\": 39,\n"
      + "    \"articles\": [\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"fortune\",\n"
      + "                \"name\": \"Fortune\"\n"
      + "            },\n"
      + "            \"author\": \"Jason Ma\",\n"
      + "            \"title\": \"Boeing may put its iconic space business up for sale and had talks with Jeff Bezos's Blue Origin, report says - Fortune\",\n"
      + "            \"description\": \"That could include the Starliner space taxi program and operations related to the International Space Station, sources told the Wall Street Journal.\",\n"
      + "            \"url\": \"https://fortune.com/2024/10/25/boeing-space-business-sale-jeff-bezoss-blue-origin-elon-musk-spacex/\",\n"
      + "            \"urlToImage\": \"https://fortune.com/img-assets/wp-content/uploads/2024/10/GettyImages-1329728877-e1729883567892.jpg?resize=1200,600\",\n"
      + "            \"publishedAt\": \"2024-10-26T04:34:43Z\",\n"
      + "            \"content\": \"Aerospace giant Boeing is under such financial strain that its exploring the sale of the business unit that supports key NASA missions, sources told the Wall Street Journalon Friday.That could includ… [+3095 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"CNBC\"\n"
      + "            },\n"
      + "            \"author\": \"Jordan Novet, Leslie Josephs\",\n"
      + "            \"title\": \"Delta sues CrowdStrike after widespread IT outage that caused thousands of cancellations - CNBC\",\n"
      + "            \"description\": \"Delta is seeking damages for its losses from the July IT incident, as well as litigation costs and punitive damages.\",\n"
      + "            \"url\": \"https://www.cnbc.com/2024/10/25/delta-suit-against-crowdstrike-after-it-outage-caused-cancellations.html\",\n"
      + "            \"urlToImage\": \"https://image.cnbcfm.com/api/v1/image/108044819-17284032002022-07-02t234208z_1580236165_rc2z3v99tiip_rtrmadp_0_usa-julyfourth-travel.jpeg?v=1728403270&w=1920&h=1080\",\n"
      + "            \"publishedAt\": \"2024-10-25T23:34:03Z\",\n"
      + "            \"content\": \"Delta Air Lines on Friday filed a lawsuit against CrowdStrike in Georgia, accusing the security software vendor of breach of contract and negligence after an outage in July that brought down millions… [+1854 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"[Removed]\"\n"
      + "            },\n"
      + "            \"author\": null,\n"
      + "            \"title\": \"[Removed]\",\n"
      + "            \"description\": \"[Removed]\",\n"
      + "            \"url\": \"https://removed.com\",\n"
      + "            \"urlToImage\": null,\n"
      + "            \"publishedAt\": \"2024-10-25T23:29:45Z\",\n"
      + "            \"content\": \"[Removed]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"reuters\",\n"
      + "                \"name\": \"Reuters\"\n"
      + "            },\n"
      + "            \"author\": \"Lisa Mattackal, Purvi Agarwal, Carolina Mandl\",\n"
      + "            \"title\": \"Nasdaq closes higher ahead of a heavy week of earnings - Reuters\",\n"
      + "            \"description\": \"The Nasdaq ended higher on Friday, driven by megacap shares, as investors awaited quarterly results from some of Wall Street's biggest companies next week.\",\n"
      + "            \"url\": \"https://www.reuters.com/markets/us/futures-gain-treasury-yields-fall-tesla-slips-2024-10-25/\",\n"
      + "            \"urlToImage\": \"https://www.reuters.com/resizer/v2/3QCBLA34KNPENKAHTWCENZN5MA.jpg?auth=918c956d7ec62ea967bce711467b0bf009f959bb5fef2fd1ecf009d4af012f3b&height=1005&width=1920&quality=80&smart=true\",\n"
      + "            \"publishedAt\": \"2024-10-25T23:26:39Z\",\n"
      + "            \"content\": null\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"the-hill\",\n"
      + "                \"name\": \"The Hill\"\n"
      + "            },\n"
      + "            \"author\": \"Rachel Frazin, Zack Budryk\",\n"
      + "            \"title\": \"Controversial lithium mine gets Biden approval - The Hill\",\n"
      + "            \"description\": \"{beacon} Energy & Environment Energy & Environment   The Big Story  Lithium mining project approved despite concerns over wildflower The Biden administration this week gave final approval to a  Nevada lithium mining project that officials say could supply eno…\",\n"
      + "            \"url\": \"https://thehill.com/newsletters/energy-environment/4954430-controversial-lithium-mine-gets-biden-approval/\",\n"
      + "            \"urlToImage\": \"https://thehill.com/wp-content/uploads/sites/2/2022/12/0658bcea5cec45c89ecab35fcfb7b7e2.jpg?w=1280\",\n"
      + "            \"publishedAt\": \"2024-10-25T22:01:00Z\",\n"
      + "            \"content\": \"The approved project was the Rhyolite Ridge Lithium-Boron mine, which the administration said will be a boon for the mineral supply chain and support U.S. jobs. \\r\\n“The Rhyolite Ridge lithium mine pro… [+1103 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"the-washington-post\",\n"
      + "                \"name\": \"The Washington Post\"\n"
      + "            },\n"
      + "            \"author\": \"Julie Zauzmer Weil\",\n"
      + "            \"title\": \"Ex-Abercrombie & Fitch CEO pleads not guilty to sex trafficking charges - The Washington Post\",\n"
      + "            \"description\": \"Mike Jeffries and his partner are accused of pressuring young men who sought modeling jobs with the retailer into unwanted sex acts.\",\n"
      + "            \"url\": \"https://www.washingtonpost.com/business/2024/10/25/mike-jeffries-arraignment-abercrombie-fitch/\",\n"
      + "            \"urlToImage\": \"https://www.washingtonpost.com/wp-apps/imrs.php?src=https://arc-anglerfish-washpost-prod-washpost.s3.amazonaws.com/public/BTTKGZOHQI5A66VJH2CPBODTBA_size-normalized.jpg&w=1440\",\n"
      + "            \"publishedAt\": \"2024-10-25T21:51:35Z\",\n"
      + "            \"content\": \"CENTRAL ISLIP, N.Y. The former chief executive of clothing company Abercrombie &amp; Fitch pleaded not guilty in federal court Friday to sex trafficking and interstate prostitution charges, after pro… [+2849 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"fortune\",\n"
      + "                \"name\": \"Fortune\"\n"
      + "            },\n"
      + "            \"author\": \"Jenn Brice\",\n"
      + "            \"title\": \"Could Elon Musk’s alliance with Donald Trump hurt Tesla's business? Not according to the company's list of 'risk factors' - Fortune\",\n"
      + "            \"description\": \"Musk's high-profile support of one of the world's most controversial political figures goes well beyond the typical political activities of public company CEOs, raising novel questions about Tesla's obligations to shareholders.\",\n"
      + "            \"url\": \"https://fortune.com/2024/10/25/elon-musk-donald-trump-tesla-business-risk-factors-warning-shareholders/\",\n"
      + "            \"urlToImage\": \"https://fortune.com/img-assets/wp-content/uploads/2024/10/GettyImages-2176994193-e1729885252146.jpg?resize=1200,600\",\n"
      + "            \"publishedAt\": \"2024-10-25T20:20:00Z\",\n"
      + "            \"content\": \"Elon Musk has gone where no CEO has gone before, hitting the campaign trail with Donald Trump, jumping for joy on stage with the presidential candidate, echoing inflammatory political rhetoric on soc… [+7016 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"fortune\",\n"
      + "                \"name\": \"Fortune\"\n"
      + "            },\n"
      + "            \"author\": \"Sasha Rogelberg\",\n"
      + "            \"title\": \"Walmart employee looked for her daughter for hours before finding her 'charred remains' in the store's walk-in bakery oven - Fortune\",\n"
      + "            \"description\": \"The 19-year-old Walmart employee who likely burned to death in the bakery's walk-in oven has been identified.\",\n"
      + "            \"url\": \"https://fortune.com/2024/10/25/walmart-employee-bakery-oven-death-halifax-gursimran-kaur-gofundme/\",\n"
      + "            \"urlToImage\": \"https://fortune.com/img-assets/wp-content/uploads/2024/10/GettyImages-1415829485-e1729869801698.jpg?resize=1200,600\",\n"
      + "            \"publishedAt\": \"2024-10-25T20:08:28Z\",\n"
      + "            \"content\": \"The 19-year-old Walmart employee who was found dead inside a Canada store bakerys walk-in oven has been identified as Gursimran Kaur, according to a GoFundMe page created by a member of the Maritime … [+2491 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"usa-today\",\n"
      + "                \"name\": \"USA Today\"\n"
      + "            },\n"
      + "            \"author\": \"Gabe Hauari\",\n"
      + "            \"title\": \"Jimmy John's unveils a new sandwich with giant pickles instead of bread: See what's on it - USA TODAY\",\n"
      + "            \"description\": \"Sandwich chain Jimmy John's is unveiling the Picklewich, a sandwich that replaces the bread with a giant kosher dill pickle.\",\n"
      + "            \"url\": \"https://www.usatoday.com/story/money/food/2024/10/25/jimmy-johns-pickle-sandwich-picklewich/75843191007/\",\n"
      + "            \"urlToImage\": \"https://www.usatoday.com/gcdn/authoring/authoring-images/2024/10/25/USAT/75844408007-turkey-picklewich-with-pickle-chips-1-1.jpg?crop=8893,5003,x0,y57&width=3200&height=1801&format=pjpg&auto=webp\",\n"
      + "            \"publishedAt\": \"2024-10-25T19:33:20Z\",\n"
      + "            \"content\": \"Have you ever taken a bite of a sandwich and thought, \\\"Hmm, this would be a lot better if the two pieces of bread were replaced with pickles\\\"? If so, Jimmy John's is introducing the perfect sandwich … [+1615 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"associated-press\",\n"
      + "                \"name\": \"Associated Press\"\n"
      + "            },\n"
      + "            \"author\": \"GABRIELA SÁ PESSOA, ELÉONORE HUGHES\",\n"
      + "            \"title\": \"Brazil reaches a $23 billion settlement with mining firms over a 2015 environmental disaster - The Associated Press\",\n"
      + "            \"description\": \"Brazil’s President Luiz Inácio Lula da Silva has signed an agreement worth tens of billions of dollars with the mining companies responsible for a 2015 dam collapse that was one of the country’s worst-ever environmental disasters. Under the agreement, Samarco…\",\n"
      + "            \"url\": \"https://apnews.com/article/brazil-mining-collapse-settlement-bhp-samarco-vale-mariana-8b84c808fa25139e019d7981a3b7de19\",\n"
      + "            \"urlToImage\": \"https://dims.apnews.com/dims4/default/403f42a/2147483647/strip/true/crop/3450x1941+0+180/resize/1440x810!/quality/90/?url=https%3A%2F%2Fassets.apnews.com%2Ff2%2Fe7%2F98b563f5af5ddd23be602e4e404e%2F9f6d881f820a45b68fcfe59f88b89acd\",\n"
      + "            \"publishedAt\": \"2024-10-25T19:20:00Z\",\n"
      + "            \"content\": \"SAO PAULO (AP) Brazils federal government on Friday reached a multibillion-dollar settlement with the mining companies responsible for a 2015 dam collapse that the government said was the countrys wo… [+6284 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"the-verge\",\n"
      + "                \"name\": \"The Verge\"\n"
      + "            },\n"
      + "            \"author\": \"Umar Shakir\",\n"
      + "            \"title\": \"All the news about Scout Motors, a classic SUV brand gone electric - The Verge\",\n"
      + "            \"description\": \"Volkswagen resurrected Scout Motors, the pioneering SUV brand. Read all the news on the upcoming electric Terra pickup and Traveler SUV coming in 2027.\",\n"
      + "            \"url\": \"https://www.theverge.com/2024/10/25/24279566/scout-motors-a-classic-suv-brand-gone-electric\",\n"
      + "            \"urlToImage\": \"https://cdn.vox-cdn.com/thumbor/Yptz9Wz9brYLNrB6Mp-AlwUsiuc=/0x0:6123x3491/1200x628/filters:focal(1877x1772:1878x1773)/cdn.vox-cdn.com/uploads/chorus_asset/file/25696685/Scout_Terra_concept_1.jpg\",\n"
      + "            \"publishedAt\": \"2024-10-25T18:54:01Z\",\n"
      + "            \"content\": \"Scout Motors, the classic off-road brand from the sixties, has been reborn as an electric vehicle company and is building a new SUV and pickup truck. The pioneering Jeep rival was brought back to lif… [+4352 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"Fox Business\"\n"
      + "            },\n"
      + "            \"author\": \"Daniella Genovese\",\n"
      + "            \"title\": \"Spirit Airlines plans to sell planes, cut jobs - Fox Business\",\n"
      + "            \"description\": \"Spirit Airlines announced in a regulatory filing this week that it agreed to sell some of its planes and plans to cut its workforce as it seeks to raise cash.\",\n"
      + "            \"url\": \"https://www.foxbusiness.com/lifestyle/spirit-airlines-plans-sell-planes-cut-jobs\",\n"
      + "            \"urlToImage\": \"https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2024/07/0/0/spirit-airlines-changes-2.jpg?ve=1&tl=1\",\n"
      + "            \"publishedAt\": \"2024-10-25T18:42:00Z\",\n"
      + "            \"content\": \"Spirit Airlines announced that it will sell multiple aircraft and lay off workers as the beleaguered carrier tries to raise cash. \\r\\nIn a filing on Thursday with the Securities and Exchange Commission… [+2292 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"CoinDesk\"\n"
      + "            },\n"
      + "            \"author\": \"Stephen  Alpher\",\n"
      + "            \"title\": \"Crypto Rally Foiled by Report of DOJ Probe of Tether - CoinDesk\",\n"
      + "            \"description\": \"Bitcoin appeared poised to make another run at $70,000, but a WSJ story of a criminal probe into the stablecoin issuer sent prices tumbling.\",\n"
      + "            \"url\": \"https://www.coindesk.com/markets/2024/10/25/crypto-rally-foiled-by-report-of-doj-probe-of-tether/\",\n"
      + "            \"urlToImage\": \"https://www.coindesk.com/resizer/bMI8h-Q5or0nYKWNXiMF1N7-CvQ=/1200x628/center/middle/cloudfront-us-east-1.images.arcpublishing.com/coindesk/LMQZF35EL5BP3B2VQW2B5GS4RY.png\",\n"
      + "            \"publishedAt\": \"2024-10-25T18:24:00Z\",\n"
      + "            \"content\": \"Earlier in the session, crypto prices had been on the rise, with bitcoin (BTC) nearing the $69,000 level and perhaps readying for a late-day or weekend challenge of topping $70,000 for the first time… [+268 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"BBC News\"\n"
      + "            },\n"
      + "            \"author\": null,\n"
      + "            \"title\": \"Microsoft boss gets 63% pay rise despite asking for reduction - BBC.com\",\n"
      + "            \"description\": \"Satya Nadella asked for a reduction because of cyber attacks the firm suffered - but still saw his earnings increase massively.\",\n"
      + "            \"url\": \"https://www.bbc.com/news/articles/cwy1lkp71n2o\",\n"
      + "            \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_news/3722/live/f354d6f0-92ee-11ef-80ec-3b9c13d9635e.jpg\",\n"
      + "            \"publishedAt\": \"2024-10-25T17:10:54Z\",\n"
      + "            \"content\": \"Microsoft's chief executive Satya Nadella earned $79.1m (£61m) last year, a rise of 63% compared to his compensation the year before.\\r\\nThat was despite a request from Mr Nadella to reduce one element… [+2404 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"Benzinga\"\n"
      + "            },\n"
      + "            \"author\": \"Michael Cohen\",\n"
      + "            \"title\": \"Nvidia Back On Top: Edges Out Apple As AI Demand Drives Market Surge - Benzinga\",\n"
      + "            \"description\": \"Nvidia surpasses Apple as world's most valuable company with market value of $3.53 trillion driven by demand for AI chips and partnerships.\",\n"
      + "            \"url\": \"https://www.benzinga.com/markets/equities/24/10/41551461/nvidia-overtakes-apple-as-worlds-most-valuable-company-again\",\n"
      + "            \"urlToImage\": \"https://cdn.benzinga.com/files/images/story/2024/10/25/Nvidia-Stock-Poised-For-Major-298B-Marke.jpeg?width=1200&height=800&fit=crop\",\n"
      + "            \"publishedAt\": \"2024-10-25T16:48:14Z\",\n"
      + "            \"content\": \"Nvidia Back On Top: Edges Out Apple As AI Demand Drives Market Surge\\r\\nNvidia CorpNVDA once again surpassed Apple IncAAPL Friday to become the world’s most valuable company.\\r\\nWhat Happened: On Friday,… [+1371 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"Barron's\"\n"
      + "            },\n"
      + "            \"author\": \"Barron's\",\n"
      + "            \"title\": \"Capri Stock Slides as Tapestry Surges on Blocked Merger Ruling. Here’s Why. - Barron's\",\n"
      + "            \"description\": null,\n"
      + "            \"url\": \"https://www.barrons.com/articles/capri-stock-tapestry-merger-blocked-9847f480\",\n"
      + "            \"urlToImage\": null,\n"
      + "            \"publishedAt\": \"2024-10-25T16:12:00Z\",\n"
      + "            \"content\": null\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"The Information\"\n"
      + "            },\n"
      + "            \"author\": \"Kevin Mclaughlin\",\n"
      + "            \"title\": \"Legal Threats, Google Competition Loom Over Perplexity’s ‘Newbie CEO’ - The Information\",\n"
      + "            \"description\": \"Aravind Srinivas didn’t set out to earn a reputation as one of the media’s biggest tech villains. It just kind of happened. Over the summer, Forbes and Wired angrily accused Srinivas’ AI search startup, Perplexity, of plagiarizing their paywalled content. In …\",\n"
      + "            \"url\": \"https://www.theinformation.com/articles/legal-threats-google-competition-loom-over-perplexitys-newbie-ceo\",\n"
      + "            \"urlToImage\": \"https://tii.imgix.net/production/articles/13854/38ef7593-1537-43d8-bc82-ca5b01aed54c.gif?auto=compress&gif-q=50&w=1200&frame=0\",\n"
      + "            \"publishedAt\": \"2024-10-25T16:00:00Z\",\n"
      + "            \"content\": \"Aravind Srinivas didnt set out to earn a reputation as one of the medias biggest tech villains. It just kind of happened.\\r\\nOver the summer, Forbes and Wired angrily accused Srinivas AI search startup… [+1217 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": null,\n"
      + "                \"name\": \"STAT\"\n"
      + "            },\n"
      + "            \"author\": \"Tara Bannow, Casey Ross\",\n"
      + "            \"title\": \"For the behemoth UnitedHealth, a new threat to Medicare profits - STAT\",\n"
      + "            \"description\": \"UnitedHealth Group reaped billions from the federal Medicare program by diagnosing patients with serious chronic illnesses, and then delivering no follow-up care.\",\n"
      + "            \"url\": \"https://www.statnews.com/2024/10/25/unitedhealth-medicare-advantage-questionable-payments-hhs-oig-audit/\",\n"
      + "            \"urlToImage\": \"https://www.statnews.com/wp-content/uploads/2024/03/AP24060627731468-1024x576.jpg\",\n"
      + "            \"publishedAt\": \"2024-10-25T15:28:42Z\",\n"
      + "            \"content\": \"For the nations largest health insurer, the evidence of abuse was stunning and unmistakable: UnitedHealth Group reaped billions from the federal Medicare program by diagnosing patients with serious c… [+1010 chars]\"\n"
      + "        },\n"
      + "        {\n"
      + "            \"source\": {\n"
      + "                \"id\": \"cnn\",\n"
      + "                \"name\": \"CNN\"\n"
      + "            },\n"
      + "            \"author\": \"Bryan Mena\",\n"
      + "            \"title\": \"Americans are feeling better about the economy after the Fed’s jumbo rate cut - CNN\",\n"
      + "            \"description\": \"Americans’ attitudes toward the economy improved this month thanks to lower interest rates.\",\n"
      + "            \"url\": \"https://www.cnn.com/2024/10/25/economy/consumer-sentiment-michigan-lower-interest-rates/index.html\",\n"
      + "            \"urlToImage\": \"https://media.cnn.com/api/v1/images/stellar/prod/gettyimages-2177012798.jpg?c=16x9&q=w_800,c_fill\",\n"
      + "            \"publishedAt\": \"2024-10-25T14:51:00Z\",\n"
      + "            \"content\": \"Americans attitudes toward the economy improved this month thanks to lower interest rates.\\r\\nThe University of Michigans latest consumer survey, released Friday, showed that sentiment rose in October … [+1819 chars]\"\n"
      + "        },\n"
      + "
      + "    ]\n"
      + "}"


  CalculatorService calculatorService= new CalculatorService();


  @BeforeEach
  public void beforeTestCase(){
    System.out.println("Before Test case");
  }

  @AfterEach
  public void afterTestCase(){
    System.out.println("After Test case");
  }

  @Test
  public void  test_addTwoNumbers(){

    int a=5;
    int b=6;
    System.out.println("test 1");
    int actualOutput=calculatorService.addTwoNumbers(a,b);
    int expectedOutput=11;
    Assertions.assertEquals(expectedOutput,actualOutput);

  }

  @Test
  public void  test_addTwoNumbers2(){

    int a=56;
    int b=66;
    System.out.println("test 2");
    int actualOutput=calculatorService.addTwoNumbers(a,b);
    int expectedOutput=122;
    Assertions.assertEquals(expectedOutput,actualOutput);

  }


}
