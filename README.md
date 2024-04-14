# SoftwareLab03

فرید فتوحی 98110073
رامتین مسلمی 99170553
صادق محمودآبادی 98106037

## گام 1

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>SmsMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن کلاس سرویس تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک کلاس با عنوان TelegramMessageService</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام sms</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendSmsMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام email</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendEmailMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>8</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>افزودن تابع اعتبارسجی ID تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع boolean با عنوان validateTelegramID</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>9</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن کلاس پیام تلگرام</p>
</td>
<td width="292">
<p>افرودن یک کلاس برای پشتیبانی از پیام‌های تلگرامی</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>10</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع ست کردن ID فرستنده</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان setSourceID</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>11</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع ست کردن ID گیرنده</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان setTargetID</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>12</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای گرفتن ID فرستنده</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان getSourceID</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>13</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>افزودن تابع برای گرفتن ID گیرنده</p>
</td>
<td width="292">
<p>افزودن یک تابع با عنوان getTargetID</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>14</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن روش ارسال تلگرامی به منو</p>
</td>
<td width="292">
<p>خط 26</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>15</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>دریاقت IDهای تلگرامی برای ارسال پیام</p>
</td>
<td width="292">
<p>خط 62 تا 76</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>16</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>خط 84 تا 87</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 16

## گام 2

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility Principle (SRP)</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>در بخش services، این اصل به درستی با پیاده‌سازی توابع مجزا برای هر service رعایت شده‌است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینکه هم contentپیام‌ها هم آدرس فرستنده و گیرده در کلاس TypeMessage ذخیره می‌شود به صورت نامحسوسی این اصل را نقض می‌کند، اما در حد refactor کردن کد مشکلی ایجاد نکرده‌است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>در بخش models این اصل به درستی رعایت شده‌است، زیرا نیازی به تغییر modelهای قبلی در صورت اضافه شدن یک model جدید نیست و با extend کردن از کلاس Message این کار امکان‌پذیر است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در بخش services، اگر بخواهیم کلاسی به پروژه بیفزاییم، مجبور به تغییر کلاس‌های دیگر هستیم.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle (LSP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>هر کلاسی توابع مربوط به بخش خودش را به درستی مدریت می‌کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>برای استفاده از هر کلاس models باید تایپ آن را بررسی کرد و نمی‌توان با کلاس پایه از کد استفاده کرد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle (ISP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>در بخش models، وابستگی بر چیزهایی که ضروری نیستند وجود ندارد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در بخش services، از توابع بلااستفاده باید در هر کلاس استفاده کرد و آنها را override نمود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle (DIP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>در بخش models، کلاس والد وابستگی ای به فرزندانش ندارد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در بخش services، پس از افزودن هر تایپ service جدید باید تابع جدیدی به کلاس MessegaService افزوده شود.</p>
</td>
</tr>
</tbody>
</table>

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>OCP</p>
</td>
<td width="246">
<p>اجبار به تغییر کلاس‌های services در صورت افزودن یک کلاس جدید</p>
</td>
<td width="284">
<p>پیاده‌سازی یک تابع sendMessage کلی و override کردن آن برای هر کلاس</p>
</td>
</tr>
<tr>
<td width="168">
<p>LSP</p>
</td>
<td width="246">
<p>بی‌استفاده بودن کلاس پایه و ضرورت کار کردن با کلاس‌های فرزند به صورت جداگانه</p>
</td>
<td width="284">
<p>ادغام کلاس‌های models در یک کلاس پایه و delagate کردن پروژه</p>
</td>
</tr>
<tr>
<td width="168">
<p>ISP</p>
</td>
<td width="246">
<p>اجبار به استفاده از توابع بلااستفاده در interfaceهای بخش services</p>
</td>
<td width="284">
<p>یکی کردن تابع sendMessage برای هر service</p>
</td>
</tr>
</tbody>
</table>

## گام 4

1. تغییرات شماره 2، 3، 4، 5، 6، 7، 9، 10، 11، 12، 13، 15، و 16
2. فقط 3 تغییر

## گام 5

با به کارگیری صحیح اصول SOLID می‌توان از بسیاری از تغییرهای غیرضروری جلوگیری کرد. همچنین از پیچیدگی‌های بی‌مورد و ناخوانایی کد نیز دوری کردیم و بسیار روند روان‌تر و بهتری برای پیاده‌سازی کد طی کردیم.
