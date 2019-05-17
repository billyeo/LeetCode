# LeetCode

BDMS FTTP Build Process
Step 1: Commit code in Eclipse
Step 2: Log into fbdsacstw01.ebiz.verizon.com
Navigate to /apps/opt/bdms-fttp/webappl/buildscripts
Run ./BuildDoAll.sh from command line
Job will take 30-40 min to complete. Once complete, notify prod support team and have them bounce
weblogic managed servers in UAT so that the new /apps/opt/bdms-fttp/webappl/bdms.ear file will be
activated.
For Production release, send test evidence, list of ticket #s for release items and business justification to
prod support team so they can include those items in the CHG record.
Make sure you tell them to only move the bdms.ear file to production so that they do not move the
veds.ear file as well.
Be available on the release night to test the application and make sure all db queries are run
successfully.



Key Table/Package/SP
Type of DB entity
Description
Key fields
Other details
app_security_user
Table


Gives access to the application, Here if the status is 1 the user is active and status is 0 user is inactive




app_security_user_group
Table
Gives access to different screens 




st_fsa_update_mdu
Package
Getting Data from MMS for MDU




st_mms_mdu_nt
Package
Getting Data from MMS for non MDU




fttp_mdu_lov
Table






fttp_mdu_property
Table






fttp_mdu_change_history
Table






fttp_mdu_detail
Table






fttp_mdu_nt
Table







Report Tool
In BDMS FTTP we have a Report tool have a separate schema RTDB and have tables
Key Table/Package/SP
Type of DB entity
Description
Key fields
Other details
rt_reports
Table
Contains the report sql for every report
report name, format name, 
sql query, which user ran the report last, last ran time.


RT_SUBSCRIPTION
Table
contains the subscription details for each report is a subscription exists for a report
user_id, report_id, frequency, emaild_id, report time, subscription time.


RT_SUBSCRIPTION_LOG
Table
contains the processing log entries for each subscriptoin
user_id, report_id,status


RT_PARAMETERS
Table
maps the report to the parameter lists used in each report
report_id, parameter position, parameter_type, paramater name, default value, multiselect, lov_id


RT_REPORT_HEADER
Table
contains all the header details and data types for each report to generate in excel format




RT_WEBSERVER_LOG
Table
contains log entries for each report that is ran from the app




