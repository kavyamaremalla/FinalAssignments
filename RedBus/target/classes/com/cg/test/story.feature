Feature: RedBus 
Scenario: Book Ticket 
	Given HomePage of rebus
	When "Pune" and "Chennai" are provided as source and destination points
	And selecting journey date 
	Then Book ticket for the corresponding details
	And Enter person details