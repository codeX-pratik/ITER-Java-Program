; NAME : PRATIK KUMAR MUDULI
; REGD. NO.: 2241013372

MOV SI,2000H
MOV CL,[SI]
MOV BL,CL
INC SI
MOV AX,0000H

BACK: ADD AX,[SI]  
      JNC NEXT     
      INC DX     
           
NEXT: INC SI
      INC SI
      DEC CL     
      JNZ BACK
     
MOV [SI],AX
INC SI
INC SI
MOV [SI],DX

DIV BX
INC SI
MOV [SI],AX
INC SI
INC SI
MOV [SI],DX         
HLT