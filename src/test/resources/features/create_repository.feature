Feature: create repositoy

	Background: Verify github login
	    Given I am login to the github
	    And System navigate to the github home page
	    
	    Scenario: create repository
	    Given click newrepository
	    Then Insert the repository name
	    Then select as a public repo and add readme file
	    And click on the create repository name
	    