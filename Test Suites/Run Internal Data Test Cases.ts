<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Run Internal Data Test Cases</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>581ac251-ed3b-4714-8ca2-70d4864b610f</testSuiteGuid>
   <testCaseLink>
      <guid>56e5e437-5ec6-4429-a640-a842b51a38be</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/InternalData_LoginLogoutSucceed</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>86ed2fe3-bbfe-4805-9b1d-d356897a7bcd</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/InternalData_UserAccount</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>86ed2fe3-bbfe-4805-9b1d-d356897a7bcd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>bd594350-4032-4d78-af0a-9eeead2b1af3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>86ed2fe3-bbfe-4805-9b1d-d356897a7bcd</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>5a5b4d02-696f-4816-8444-b045800fbdae</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2c8d3ae0-f71f-4d75-8cde-71c11665a441</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/InternalData_LoginFailInvalidAccount</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>22e3b8b2-1ae3-4c7f-b084-0ebc67c7d702</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/InternalData_InvalidAccount</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>22e3b8b2-1ae3-4c7f-b084-0ebc67c7d702</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>3b135aee-2edc-44a5-ad81-5f8cb3a86de2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>22e3b8b2-1ae3-4c7f-b084-0ebc67c7d702</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>052e2a2c-f7a5-4d83-bf6a-fc70a5004035</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
