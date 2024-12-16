package com.example.newsyy;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PrivacyPolicy extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_privacy_policy);

        textView = findViewById(R.id.PolicyText);
        String para ="Privacy Policy\n" +
                "\n" +
                "We at TIMES INTERNET LIMITED (TIL, Company, we, our, us) respect your privacy and are committed to protecting your personal data. In this privacy policy, we explain how we collect, use, and process your personal information when you access our Website or associated mobile application (each, an App and together, Apps), for delivery of Services. Unless indicated otherwise, this privacy policy further applies to any related websites or other online properties owned or controlled by Company (together with the Websites and Apps, the Platforms). Services mean to include all the content, services, information, and related made available to you “as is” from our Platforms.\n" +
                "\n" +
                "This Privacy Policy must be read in conjunction and together with the Terms of Use of the particular Platform you are using, available at: [https://navbharattimes.indiatimes.com/termsandcondition.cms]. Please note that links from our website may take you to external websites which are not covered by this policy. We recommend that you check their privacy policies before you access, use, or download from such sites. We will not be responsible for the content, function, or information collection policies of these external websites.\n" +
                "\n" +
                "By accessing, downloading, using the Platform(s) that we operate, which has a direct link to this Policy, you agree to be governed by the Privacy Policy of the Company.\n" +
                "\n" +
                "By agreeing to this Privacy Policy, you represent that you shall not access our Services by means of any mechanism or technology which conceals your actual geo-location or provides incorrect details of your location, (for example, use a virtual private network (VPN) to access our Services\n" +
                ". We shall not be responsible or liable for any processing or collection of your information if you use these mechanisms to access our Platforms and Services.\n" +
                "\n" +
                "Information We Collect\n" +
                "We will only collect your personal information where it is necessary for us to provide you with a service at your request, such as when you contact us, register an account on our website, avail of subscription services, or access the content on the Platform(s). We have discussed the manners of our collection of information, herein in greater detail for your reference:\n" +
                "\n" +
                "Information submitted to us:\n" +
                "You give us information about you whenever you use our services, such as by doing the following, some of the following categories of information are collected directly by us, and some are provided by you directly for the performance of certain functions:\n" +
                "\n" +
                "Accessing our Platforms by means of any web browser or device;\n" +
                "Registration, subscribing for our Services on our Platforms;\n" +
                "Enquiring about our products or services;\n" +
                "Purchasing our subscription packages on the Platforms;\n" +
                "Initiating and maintaining correspondence with us.\n" +
                "This information may include but not be limited to the following:\n" +
                "\n" +
                "Identification information such as user name, date of birth, gender, profile picture, qualification, location;\n" +
                "Social media plugin details like – Facebook, Google, LinkedIn, Apple ID or any other– for the purpose of identification\n" +
                "Contact information such as email address, mobile number;\n" +
                "Payment information (this is securely collected and processed by our payment service provider exclusively);\n" +
                "Additional information relevant to your use of our Platforms and Services, such as one time password sent for registration, your marketing preferences, place of employment and designation, survey responses and feedback;\n" +
                "Financial information – Investment details, compensation details, salary range, where the relevant Service of the Platform requires such indicators.\n" +
                "We take extra precautions to ensure that such sensitive personal data is kept secure and confidential, and we will only retain this data for as long as necessary for the purposes for which we collect it.\n" +
                "\n" +
                "Information we collect automatically:\n" +
                "We collect information using cookies and other similar technologies to help distinguish you from other users of our Platforms, and streamline your online.\n" +
                "\n" +
                "When you visit our Platforms, we may collect the following information:\n" +
                "\n" +
                "Your activity logs on the Platform(s) - Which pages you access, view and which links you follow;\n" +
                "Your IP address/ device's serial number or unique identification number and general location, including country, address and pin code;\n" +
                "A device identifier (cookie or IP address or Device ID or Android Advertiser ID / iDFA ID), or any other identifier;\n" +
                "Details of the hardware and software that you are using to access the Platforms such as your computer/device name, your operating system, browser type and version, application version, operator name, screen size, CPU speed, and connection speed;\n" +
                "Any passwords that you use on our Platforms or any other authentication token used to login;\n" +
                "URL and time stamps;\n" +
                "Details of your visits to our Platforms and the resources that you access, including, but not limited to, traffic data, location data, web logs and other communication data.\n" +
                "Information we collect about you from other sources.\n" +
                "We may collect information about you from other sources. This may include the following:\n" +
                "\n" +
                "Publicly available information.\n" +
                "Information you have shared publicly, including on social media. We collect your e-mail ID and the relevant public profile information, which may include your name, profile picture, age, gender, and any other pertinent information from such social media account which is, necessary for verification of your identity.\n" +
                "We also receive information from you when you interact with our pages, Apps, groups, accounts, or posts on social media platforms.\n" +
                "This list is not exhaustive, and, in specific instances, we may need to collect additional data for the purposes set out in this policy.\n" +
                "\n" +
                "Information we receive about you from other sources\n" +
                "Sometimes you will have given your consent to other websites, services or third parties to provide information to us.\n" +
                "\n" +
                "It could include information from third parties that we work with to provide our products and services, such as delivery companies, technical support companies and advertising companies. Whenever we receive information about you from these third parties, we will only use it in such manner that is already communicated to you, as per this Policy, and for such defined purposes only. We may further collect additional analytics reports, information from other services, websites, who work together with us.\n" +
                "\n" +
                "When you chose any subscription or paid service, we or our payment gateway provider may collect and/or process your personal information such as address or billing information, including your credit/debit card number and expiration date etc. as per the terms of this Policy. Any financial information provided by you will be processed by such third parties who provide the functionalities for such Services to us, for effective processing. We encourage you to familiarize yourself with the privacy policies provided by such third parties prior to providing them with your information or entering into any transactions with them.\n" +
                "\n" +
                "Marketing and Analytics\n" +
                "\n" +
                "We may use Web Beacons to track your online usage patterns in an anonymous manner, without collection your personally identifiable information. We may also use web beacons in HTML emails that we send subscribers who have opted in to receive email from us, to determine whether our recipients have opened those emails and/or clicked on links in those emails.We use this information to inter-alia deliver our web pages to you upon request, to tailor our Platform(s) to the interests of our users, to measure traffic within our Platform(s) to improve the quality, functionality and interactivity of our Platform(s) and let advertisers know the geographic locations from where our Users come without personally identifying the users.\n" +
                "\n" +
                "We place website beacons to collect data for our partners, we require our partners to inform users on their privacy policy page that the webpage uses website beacons. This option will only be recorded in your current browser and will not be recorded in your user history.\n" +
                "\n" +
                "Purpose of Collection of Information.\n" +
                "We collect information (including Personal Information) to provide the Services and for the purposes as outlined below including but not limited to:\n" +
                "to help us identify you when you log into the Platform and when you register an account with us, and, to map a specific profile with an authorized user;\n" +
                "to help facilitate in-app purchases and make subscribed and paid content available to you;\n" +
                "to enhance the quality of services that we provide and improve your experience during browsing;\n" +
                "to personalize your browsing experience on the Platform(s);\n" +
                "to recommend videos, content, news to users they might be interested in;\n" +
                "for providing location-based services;\n" +
                "for the performance of a contractual and legal obligation;\n" +
                "to communicate with you;\n" +
                "to provide you with news, special offers, general information, commercial communications about other products and services along with marketing information and surveys;\n" +
                "to provide and process service requests initiated by you.\n" +
                "Notification of any changes in the terms of use or privacy policy;\n" +
                "Resolution of any queries related to your use of Services.\n" +
                "Any other new services developed by us, our affiliates, subsidiaries and /or third party partners Sharing and Use\n" +
                "We may share your information with our trusted partners or third parties who provide us with support services, for meeting the obligations agreed to between you and us.\n" +
                "We may use and/or disclose your information with the Company-controlled businesses, affiliates, subsidiaries and other entities within the Times of India Group of companies, other third party business partners, service providers including but not limited to services provider, advertising networks, technology partner, social networks and any other third parties:\n" +
                "to assist them to reach out to you in relation to their programs or campaigns (including marketing and sales) and to process your query / requests (such as job application) and/or provide with the services;\n" +
                "to process payments on our behalf. Our payment provider will collect and process your payment details; we will not store or have access to your full credit or debit card details, except any transactional information for the purpose of reconciliation of transactions on our Platform(s).\n" +
                "to send e-mails, instant messages, social media messages and SMS messages and/or manage contact management systems.\n" +
                "recommendations services, ad tech services, analytic services, including but not limited to click stream information, browser type, time and date, information about your interactions with advertisements and other content, including through the use of cookies, beacons, mobile ad identifiers, and similar technologies, in order to provide content, advertising, or functionality or to measure and analyze ad performance, on our Services or Platforms and on 3rd party platforms.\n" +
                "serve ads on our Platforms, affiliate websites, and any other digital platform available on the internet. However, the privacy policy of such digital platform shall be applicable upon the processing of information on such third party digital platform.\n" +
                "to assist and to reach out to you in relation to various programs or campaigns (including marketing and sales) and/or to process your query / requests.\n" +
                "We may further be required to share your personal information in certain exceptional circumstances; this would be where we believe that the disclosure is:\n" +
                "Required by the law, or in order to comply with judicial proceedings, court orders or legal or regulatory proceedings.\n" +
                "Necessary to protect the safety of our employees, our property or the public.\n" +
                "Necessary for the prevention or detection of crime, including exchanging information with other companies or organizations for the purposes of fraud protection and credit risk reduction.\n" +
                "Proportionate as part of a merger, business, or asset sale, in the event that this happens we will share your information with the prospective seller or buyer involved.\n" +
                "Data Retention\n" +
                "We will only store your personal information for as long as we need it for the purposes for which it was collected. Retention periods for records will also be based on the type of record, the nature of the activity and product and service that the same is associated with, linked to.\n" +
                "We retain your information till such period that is required for the purposes of us meeting your requests on our Platforms, and in compliance with the applicable laws, statutory requirements.\n" +
                "Information Security.\n" +
                "We take commercially reasonable technical, physical, and organizational steps to safeguard any information you provide to us, to protect it from unauthorized access, loss, misuse, or alteration.\n" +
                "We try to ensure that all information you provide to us is transferred securely via the website (always check for the padlock symbol in your browser, and “https” in the URL, to ensure that your connection is secure).\n" +
                "All information you provide to us is stored on secure servers. Where we have given you (or where you have chosen) a password which enables you to access certain parts of our website, you are responsible for keeping this password confidential. We ask you not to share a password with anyone.\n" +
                "Although we take reasonable security precautions, no computer system or transmission of information can ever be completely secure or error-free, and you should not expect that your information will remain private under all circumstances. The Company will not be liable for any damages of any kind arising from the use of the Platform, including, but not limited to any indirect, incidental, special, consequential or punitive damages, or any loss of profits or revenues, whether incurred directly or indirectly or any loss of data, use, good-will, or other intangible losses.\n" +
                "Data Subject Rights\n" +
                "If you require any further information about your rights as explained below, or if you would like to exercise any of your rights, please reach out to us by writing to the Grievance Officer of the Company.\n" +
                "\n" +
                "You have the right to access your personal data.\n" +
                "You have the right to correct any inaccurate or incomplete personal data\n" +
                "You have the right to withdraw your consent\n" +
                "You have the right to request deletion of your account\n" +
                "However, we may maintain backup copies of your information, to the extent necessary to comply with our legal obligations.\n" +
                "\n" +
                "Cross-Border Transfers\n" +
                "We operate globally and may transfer your personal information to individual companies of the Times Internet Limited affiliated companies or third parties in locations around the world for the purposes described in this privacy policy, only upon satisfaction that the country has an adequate and appropriate level of protection, and the transfer of information is lawful. We shall comply with our legal and regulatory obligations in relation to your Information, including having a lawful basis for transferring Personal Information and putting appropriate safeguards in place to ensure an adequate level of protection for the Personal Information. We will also ensure that the recipient in such alternate country is obliged to protect your Information at a standard of protection comparable to the protection under applicable laws. Our lawful basis for such transfer will be either on the basis of content or one of the safeguards permissible by laws.\n" +
                "Children Privacy\n" +
                "You must have attained the age of majority to be able to use and access our Services. If you are a minor in your jurisdiction, your registration and use of our Services must be with the supervision of an adult.\n" +
                "As a parent or legal guardian, please do not allow your minors under your care to submit Personal Information to us. In the event that such Personal Information of a minor is disclosed to us, you hereby consent to the processing of the minor’s Personal Information and accept and agree to be bound by this Privacy Policy and take responsibility for his or her actions.\n" +
                "However, if the Company is notified that the personal data of individuals below the age of majority has been collected by Us, without user or parental consent, We shall take all necessary steps to delete such information from our servers. As a parent or legal guardian, you are encouraged to reach out to the Grievance Officer, for redressal of any complaints in relation to collection of children data.\n" +
                "Changes to the Privacy Policy\n" +
                "Any changes we make to our privacy policy in the future, to incorporate necessary changes in technology, applicable law, will be posted on this page and, where appropriate, notified to you by e-mail. Your use of the Services after such notice shall be deemed as acceptance of such changes to our Privacy Policy. Please check back frequently to see any updates or changes to our privacy policy.\n" +
                "\n" +
                "This version was last updated on [8 Dec 2022] and historic versions can be obtained by contacting us.\n" +
                "\n" +
                "Grievance Redressal\n" +
                "If you have any complaints, concerns with regards to the use, storage, deletion, and disclosure of your personal information provided to Us, you may reach out to the designate Grievance Officer. The Grievance Officer appointed by Times Internet Limited is [Akhilesh Shrivastava]. who can be contacted at [akhilesh.s@timesinternet.in].\n" +
                "\n" +
                "You can also write to:\n" +
                "\n" +
                "Address:\n" +
                "\n" +
                "Times Internet Limited\n" +
                "\n" +
                "391, Udyog Vihar, Phase - III,\n" +
                "\n" +
                "Gurgaon, Haryana 122002, India\n" +
                "\n" +
                "Ph: 0124-4518550\n" +
                "\n" +
                "\n" +
                "Please ensure that you do not share any feedback communication with an unauthorized member of the Company; the Company will not be responsible for the resolution of your query, in such case. If you choose to write to Us, you must address such communication to “Grievance Officer” and provide the following information:\n" +
                "\n" +
                "Your identification details – Name, Times Identification ID, if applicable;\n" +
                "Details of your specific concern(s);\n" +
                "Clear statement as to whether the information is personal information or sensitive personal information;\n" +
                "Your address, telephone number or e-mail address;\n" +
                "A statement that you have a good-faith belief that the information has been processed incorrectly or disclosed without authorization, as the case may be;\n" +
                "A statement, under penalty of perjury, that the information in the notice is accurate, and that the information being complained about belongs to you;\n" +
                "\n" +
                "The Company may reach out to you to confirm or discuss certain details about your complaint and issues raised.";


        textView.setText(para);

        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}