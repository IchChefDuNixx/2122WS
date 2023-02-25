import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('127.0.0.1', 9992))

client.send("hello".encode('ascii'))

message = client.recv(1024).decode('ascii')
print(message)
client.close()
