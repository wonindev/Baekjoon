![image](https://user-images.githubusercontent.com/100292629/178110023-ee3d5a55-c339-4254-85d3-57b3895a1f20.png)
---
```python
input = input()

stack = []
strTemp = ""
for char in input:
    if char in "*/+-()":
        if char == '(':
            stack.append(char)
    
        elif char == ')':
            while stack and stack[-1] != '(':
                strTemp += stack.pop()
            stack.pop()
    
        elif char in '*/':
            while stack and (stack[-1] == "*" or stack[-1] == "/")  and stack[-1] != "(":
                strTemp+=stack.pop()
            stack.append(char)

        elif char in '+-':
            while stack and stack[-1] != "(":
                    strTemp += stack.pop()
            stack.append(char)

    else:
        strTemp += char
    
while stack:
    strTemp+=stack.pop()


print(strTemp)
```