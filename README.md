# Laboration 1 – Bibliotekshanteraren

## Designval

### Book
Book är ett record eftersom en bok här består av enkel data som isbn, titel och författare.
Dessa värden behöver inte ändras efter att objektet har skapats.

### Member
Member är en vanlig class eftersom medlemmen har tillstånd som kan förändras, till exempel antal aktiva lån.

activeLoans ändras genom egna metoder i stället för en setter.
På så sätt kan värdet ändras på ett mer kontrollerat sätt och inte sättas direkt till ett valfritt värde.

### Library
Library är en vanlig class eftersom den håller reda på bibliotekets föränderliga tillstånd.

Böcker och medlemmar lagras i arrayer med fast storlek.

En separat array, borrowedBy, används för att hålla reda på om en bok är utlånad och vilken medlem som har lånat den.