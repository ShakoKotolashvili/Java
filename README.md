# Java

ტესტები

რა არის JVM?  (2 ქულა)
JVM არის ჯავას ვირტუალური მანქანა, რომელიც კომპიუტერს აძლევს საშუალებას გაუშვას ჯავა ენაზე დაწერილ კოდი. ასევე იმ ენაზე დაწერილი კოდებიც რომელიც ჯავას ბაიტოდბს იყენებს.
რა არის JDK? (2 ქულა)
JDK java development Kit ეს არის სოფთვეარ ხელსაწყოებისა და ბიბლიოთეკების ნაკრები, რომელიც არის დაიმპლემენტირებული ჯავას პროგრამულ ენაში და ამარტივებს პროგრამირებას.
რა არის პრიმიტივი? (2 ქულა)
პრიმიტივები არის მონაცემთა ძირითადი ტიპები ჯავაში, ის განსაზღვრავს ცვლადის მნიშვნელობების ზომასა და ტიპს და არ გააჩია დამატებითი მეთოდები. ჯავაში გვაქვს 8 პრიმიტივ ტიპი ესენია: ბულეანი, ბაიტი, ჩარი, შორტი, ინტი, ლონგი, ფლოატი და დაბლი.
რა განსხვავებაა პრიმიტივსა და ობიექტს შორის? (2 ქულა)
მინაცემთა პრიმიტივეული ტიპები წინასწარაა გასაზღვრული ჯავაში, ხოლო მონაცემთა ობიექტების ტიპებს ქმინან მომხმარებლები
რატომ ეძახიან JAVA-ს მულტიპლატფორმულ პროგრამირების ენას? (2 ქულა)
იმიტომ, რომ ჯავას პროგრამული კოდი კომპილირდება ბაიტკოდებში, რომელიც შემდეგ JVM-ის საშუალებით ეშვება, ამიტომ ბაიტკოდები ერთნაირად იშვება ყველა განსხვავებულ პლატფორმაზე.
რა არის ნაკადი? (2 ქულა)
პროგრამას შეიძლება ქონდეს ორი ან მეტი ნაკადი, რომელსაც შეუძლია ერთდროულად მუშაობა და როგორც ერთიდაიგივე ასევე სხვადასხვა საქმის შესრულება, რაც რესურსების ოპტიმალურ გამოყენებას უწყობს ხელს.
რამდენი ხერხით შეიძლება ნაკადის შექმნა? (2 ქულა)
ნაკადების შექმნა შეგვძლია 2 მექანიზმთ ესენია: Thread კლასიის მემკვიდრე კლასის შექმნით ან runnable ინტერფეისის დაიმპლემენტირებით.
აღწერეთ ნაკადის სასიცოცხლო ციკლი. (2 ქულა)
ნაკადები სასიცოცხლო ციკლი იწყენა შექმნიდან, რასაც ეწოდება new მდგომარეობა, ამის შემდეგ ნაკადი გადადის runable მგომარეობაში, ამ მგომარეობაში ნაკადი ნებსმიერ წამს მზად არის გასაშვეად, ამ მდგომსარეობიდან ნაკადიშეიძლება გადავიდეს dead მდგოამრეობაშ და მისი ციკლი დასრულდეს ან გადავიდეს running მდგომარეობაშ და შეასრულოს მისთვის დაკისრებული მოვალეობა, ამ მდგომარეობიდან შემდეგ ის შეიძლება გადავიდეს dead მდგომარეობაში და მოკვდეს ან გადავიდეს waiting მდგომარეობაშ ამ შემთხვევაში ნაკადი ელოდედა სხვა ნაკადებს და მათი დასრილების შემდეგ გაეშვება ის, და ბოლოს გვაქვს dead მდგომარეპბა რომლის დროსაც ნაკადის სასიცოცხლო ციკლი მთავრდება.
რას ეწოდება ინკაფსულაცია? (2 ქულა)
ენკაფსულაცია არის მონაცემთა დამალვის პროცესი. ამ დროს განისაზღვრება მონაცემებზე წვდომა, სიდან შეიძლება მათზე წვდომა, მათ მოდიფიკაცია და ა.შ.
რას ეწოდება მემკვიდრეობითობა? (2 ქულა)
მემკვიდერეობა არის პროცესი, როდესაც ერთ ობიექტს შეიძლება გადავცეთ მეორის ნიშანთვისებები. და ამით შევქმნათ იერარქიული სისტემა.
რას ეწოდება პოლიმორფიზმი? (2 ქულა)
პოლიმორფიზმი საშუალებას გვაძლევს შევქმნათ კლასი ტანი, ზოგადი აღწერა, ხოლო შემდეგ სიტვაციიდან გამომდინარე გავუწეროთ მას კონკრეტული ფუნქციები.
რას ეწოდება სტეკი? (2 ქულა)
სტეკი არის Last In First Out მონაცემთა სტრუქტურა. იგი მხარს უჭერს ორ ძირითად ოპერაციას, სახელწოდებით push და pop. Push ოპერაცია ამატებს ელემენტს სტეკის ზედა ნაწილში, ხოლო pop ოპერაცია შლის ელემენტს სტეკის ზემოდან. ჯავა უზრუნველყოფს Stack კლასს, რომელიც აყალიბებს Stack მონაცემთა სტრუქტურას.
რას ეწოდება ჰიპი? (2 ქულა)
ჰიპი არის მეხსიერების არეალი, რომელიც გამოიეყება შექმნილი ობიექტების შესანახავ. როდესაც JVM უშვებს პროგრამას იქმენბა ჰიპი და ყველა ის ობიექტი რომელიც ინახება ჰიპშ შეიძლება გაზიარებული იყოს ნაკადებს შორის, სანამ აპლიკაცია გარანულია.


რა არის Garbage Collection? (2 ქულა)
Garbage Collection არის ავტომატური პროცესი მეხსიერბის გაწმენდისთვის, ეს გულისხმობს ისეთი კოდის და ცვლადების წაშლას მეხსიერებიდან, რომელიც აღარ არის საჭირო ან გამოსაყენებელი, რაც ათავისუფლებს მეხსიერებას. 
რას ეწოდება კონსტრუქტორი? (2 ქულა)
ეს არის კლასის მეთოდი, რომელსაც აქვს კლასის ანალოგიური სახელი და ჯლასის ობიექტის შექმნის თანავე ეშვება, ძირითადად გამოიყენება ობიექტის ინიციალიზაციისათვის, მას შეიძლება გადავცეთ ან არ გადავცეთ პარამეტები და შეიძლება გვქონდეს 0 1 ან რამდენიმე კონსტრუქტორი.
რა განსხვავება კლასის მეთდსა და კლასის წევრს შორის? (2 ქულა)
კალსის მეთოდი არის კლასის კონკრეტული ნაწილი, სადაც განსაზღვრულია ის მოქმედებები რისი შესრულებაც შეუძლია ამ კლასს, ხოო კლასში განსაზღვრულ მეთოდებსა და ცვლადებს ერთობლივად უწოდებენ კლასის წევრებს.
რას ეწოდება Package? (2 ქულა)
ფექიჯი არის იგიე საქაღალდე, სადაც საერთო ნიშნით დაჯგუფებულია კლასები ფაილები და ა.შ.
რა განსხვავებაა final კლასსა და abstract კლასს შორის? (2 ქულა)
მთავარი გასხვავება ამ ორს შორის არის ის რომ აბსტრაქტულ კლასს შეიძლება ყავდეს მემკვიდრე კლასი, ხოლო ფაინალ კლასისთვის ეს შეუძლებელია 
რას ეწოდება გამონაკლისი შემთხვევა? (2 ქულა)
როდესაც კოდს ვუშვებთ შეძლება სხვადასხვა სახის ერორები მივიღოთ. როდესაც ერორს ვიღებთ ძირითად შემთხვევაში პროგრამა წყვეტს მუშაობას და აგენერირებს ერორს რასაც exception ქვია, ასეთი ერორების  მართვა შეგვიძლია try/catch კონსტრუქციით.
რამდენი ხერხით შეიძლება გამონაკლისი შემთხვევის დამუშავება? (2 ქულა)
გამონაკლისებში გვაქვს 2 შემთხვევა chacked (compile time exception) და unchacked (runtime exception) ორივე მათგანის დამუშავება შეიძლება try/catch/finally კონსტრუქციიტ. 
რას ეწოდება ინტერფეისი? (2 ქულა)
ეს არის ჯავას კლასი, რომელიც შეიცავს აბსტრაქტულ მეთოდებს და ატრიბუტებს, ანუ ინტერფეისი მოიცავს მხოლოდ მეთოდების დეკლარაციას და ეს მეთოდი დაწვრილებით გაწერილი იქნება იმ კლასში სადაც გამოვიძახებთ.
რა განსხვავებაა ინტერფეისსა და აბსტრაქტულ კლასს შორის? (2 ქულა)
აბსტრაქტული კლასი შეიცავს როგროც აბსტრაქტულ ასევე არააბსტრაქტულ მეთოდებს, ხოლო ნტერფეისი შეიცავს მხოლოდ აბსტრაქტულ მეთოდებს.
რა განსხვავება public და protected მოდიფიკატორებით განსაზღვრულ კლასის წევრებს შორის? (2 ქულა)
Public კლასის წევრებზე წვდომა შეიძლება ყველგან, როგროც კლასის შიგნით ასევე კლასის გარედანაც, ხოლო ptorected კლასის წევრებზე წვდომა შეგვიძლია მხოლოდ კლასის შიგნით.
რა განსხვავება public მოდიფიკატორსა და მოდიფიკატორის გარეშე განსაზღვრულ კლასის წევრს შორის? (2 ქულა)
ფაბლიქის დროს კლასის წევრები ხელმისაწვდომია ყველა კლასიდან, ხოლო დეფაულთის დროს კდის წევრები ხელმისაწვდომია მხოლოდ იგივე ფექიჯშ
რა განსხვავება სტეკსა და ჰიპს შორის? (2 ქულა)
ჰიპის მეხსიერება გამოიყენება მთლიანი კოდის მიერ, ხოლო სტეკს იყენებენ მხოლოდ ნაკადები
რა განსხვებაა FileWriter და BufferedWriter კლასების გამოყენებას შორის? (2 ქულა)
FileWriter ფუნქცია გამოიყენება ფაილში ჩასაწერად და როდესაც ამ ფუნქციას ვიყენებთ ფაილში იწერება მხოლოდ 1 სიმბოლო, ხოლო BufferdWriter ასევე გამოიყენება ფაილში ჩასაწერათ მაგრამ ამ დროს ფუნქცია ბუფერში აგროვებს სიმბოლოებს და ერთ ჩაწერაზე შეუძლია რამდენიმე ჩაწეროს.
რას ეწოდება Thread sheduler? (2 ქულა)
Thread sheduler განსზღვრავს ნაკადების მდგომარეობას, მაგალითად რომელი გაუშვას, რომელი გააჩეროს, რომელი იქნება ვეითინგ მდგომარეობაში და ა.შ
რა საფრთხე არსებობს ნაკადებთან მუშაობის დროს? (2 ქულა)

რა განსხვავებაა List და Set კოლექციების ინტერფეისებს შორის? (2 ქულა)
როგორ ხდება ArrayList-ში მონაცემების დამატება, წაშლა, შეცვლა, ძიება? (2 ქულა)
რა უპირატესობა აქვს LinkedList-ს ArrayList-თან შედარებით და პირიქით? (2 ქულა)
რა არის Socket, რა არის ServerSocket? (2 ქულა)
რა შემშთხვევაში გამოიყენება Socket-ები? (2 ქულა)
რა არის iterator? (2 ქულა)
რომელი ტიპის ობიექტებით ხდება Socket-ის კავშირით მონაცემების გადაცემა-მიღება? (2 ქულა)
რა არის Javafx? (2 ქულა)
აღწერეთ Javafx-ის აპლიკაციის შექმნის პროცესი? (2 ქულა)
რას წარმოადგენს Scena კლასი Javafx-ში? (2 ქულა)
რა არის JDBC? (2 ქულა)
აღწერეთ მონაცემების წამოღების პროცესი JDBC-ის საშუალებით? (2 ქულა)
აღწერეთ მონაცემების წაშლის პროცესი JDBC-ის საშუალებით PreparedStatement ობიექტის საშუალებით? (2 ქულა)
აღწერეთ მონაცემების რედაქტირების პროცესი JDBC-ის საშუალებით PreparedStatement ობიექტის საშუალებით?(2 ქულა)
აღწერეთ მონაცემების ჩაწერის პროცესი JDBC-ის საშუალებით Statement ობიექტის საშუალებით?(2 ქულა)
