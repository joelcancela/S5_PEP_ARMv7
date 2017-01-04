LDR R0, #0 //Chargement de la valeur de la case 0 de la RAM dans le registre 0
LDR R1, #0 //Chargement de la valeur de la case 0 de la RAM dans le registre 1
SUB R0, R1, R0 // R0 prend la valeur de R1-R0
BRANCH 5 //Si R0==0 goto instruction de la ram à l'adresse 5 (la 6e) sinon ignoré
LDR R2, #2 //Ignoré
LDR R3, #3 //Chargement de la valeur de la case 3 de la RAM dans le registre 3
LSL R0, R1, #3 //Décalage de 3 à gauche de la valeur de R1 dans R0
ORR R2, R3 //OU logique R3 et R0 dans R2