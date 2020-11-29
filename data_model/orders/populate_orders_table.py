import boto3
import csv
import os
from time import sleep


def insert_order(order):
    return table.put_item(
        Item={
            'orderID': order['orderID'],
            'customerID': order['customerID'],
            'vendors': order['vendors'],
            'products': order['products'],
            'order_status': order['order_status']
        }
    )


def create_orders_table():
    try:
        resp = dynamodb.create_table(

            TableName="Orders",

            AttributeDefinitions=[
                {
                    "AttributeName": "customerID",
                    "AttributeType": "S"
                },
                {
                    "AttributeName": "orderID",
                    "AttributeType": "S"
                },

            ],

            KeySchema=[
                {
                    "AttributeName": "customerID",
                    "KeyType": "HASH"
                },
                {
                    "AttributeName": "orderID",
                    "KeyType": "RANGE"
                }
            ],
            ProvisionedThroughput={
                "ReadCapacityUnits": 1,
                "WriteCapacityUnits": 1
            },
        )
        return resp
    except Exception as e:
        print(e)


if __name__ == '__main__':
    # dynamodb = boto3.resource('dynamodb',endpoint_url="http://localhost:4566")
    dynamodb = boto3.resource('dynamodb', endpoint_url="http://localhost:8000")
    # create_orders_table()
    # sleep(5)
    table = dynamodb.Table('Orders')

    with open('orders.csv', newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        for row in reader:
            insert_order(row)
