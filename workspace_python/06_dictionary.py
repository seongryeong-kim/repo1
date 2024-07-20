# dictionary - 제이슨과 동일 
lux = {'health':490, 'mana':334, 'melee':550, 'armor':18.72}
print(lux['mana'])
lux['mana'] = 400
print(lux['mana'])

x = {1,2,3} #키만 존재할 수도 있다
print(x)

# 'mana'가 lux에 있나 확인
print('mana' in lux)
print( len(lux) ) # 4개 있다

print( lux.items() )
print( lux.keys() )
print( lux.values() )

print( lux.get('mana') )
print( lux.get('mana2') ) #key 값이 없을 때 None 
print( lux.get('mana2','not found') ) #None일 때 기본값을 지정할 수 있다 

