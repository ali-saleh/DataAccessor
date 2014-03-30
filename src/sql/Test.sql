SELECT 
    i.id
FROM
    base_user u
        join
    contact c ON c.user_id = u.id
        join
    invoice i ON i.user_id = u.id
where
    u.entity_id = 1 AND c.city like 1
        AND i.currency_id = 12
        AND i.create_datetime >= '2012-3-1'
        AND i.create_datetime < '2012-4-30'
        AND i.is_review = 0
        AND i.deleted = 0
;

/*9204,10515,8762,9710,8793,9776,9587,
8580,9557,9120,10312,9901,10553,9083,
10211,9040,10148,9056,8835,9824,9599,
8765,9797,9218,10301,8825,9812,8788,
9757,9077,8798,9808,8799,9784,8753,9792,
8724,8955,8661,8721,8627,9744,8649,9608,
8912,10039,9290,8630,9549,9139,9522,9523,
8816,9012,9097,10105,8929,9793,9072,8642,
8643,8971,10030,8907,9276,8957,9924,9222,
9223,9511,9512,8578,9555,8552,9414,9036,
9946,9260,10551,8795,8796,9050,9918,9762,
9405,8794,9825,8588,9588,9751,8807,9794,
8976,10061,8551,9509,8790,9790,8579,9579,
9058,10132,8570,8730,9582,9516,8601,9217,
9209,10549,9053,10064,9596,8965,9942,8918,
9801,8924,9820,9283,10507,9769,8597,9304,
10310,9539,8555,9224,10400,8553,9607,8610,
9547,9519,8830,9800,8581,9620,8925,9741,
8740,9806,9087,8768,9609,8707,9576,8539,
9319,9586,9233,10522,8784,9001,10063,8948,
9935,9258,10533,8554,9308,10552,9035,10067,
9136,10130,10134,8939,9220,9622,8771,9628,
8568,9291,10109,9226,10304,9265,8567,8705,
9720,8594,9700,9052,10031,8719,9750,8738,9745,
8834,9827,9086,8769,9917,9284,9930,9124,10200,
9000,10004,9100,10119,9571,10068,10069,8779,
9738,8736,9804,8745,8549,9809,9231,10502,8806,
9743,9251,10520,8557,9595,8556,9322,8569,9618,
9619,9098,10082,9789,8564,9039,9723,8763,9625,
8604,9616,9502,8603,9617,9219,10201,8595,10094,
9593,8596,9567,8829,9811,8624,9623,9030,9900,
9232,10501,8919,9747,8577,9819,8544,9271,8585,
9589,9045,10131,8791,9716,9037,9948,8914,9581,
10538,9208,10125,8591,9629,9275,10521,9143,
10300,8910,9944,8602,9578,8728,9137,8541,
8542,8634,9569,9027,9410,8706,9563,9216,
10410,9305,9228,10307,9127,10129,8823,9760,
8548,9584,8812,9910,9121,9721,9044,10117,9118,
10311,8804,9560,8967,10040,10037,8710,10052,
10015,9270,10541,8969,10041,8746,9413,9301,
9062,9277,10532,9278,10534,9279,10535,8713,
9761,9505,9503,9565,9060,10147,9303,10542,9200,
9046,10080,8732,9580,9262,8972,8923,9938,9145,
10401,9238,10518,9411,8783,9923,9025,9936,9090,
10203,8599,9002,8974,9922,8958,8956,9932,9280,
10536,8962,10009,8937,8940,8754,10317,8617,9704,
9041,9206,8782,9093,8797,9543,9146,10137,8621,9065,
10315,8780,9770,8729,9772,8922,8802,9919,8572,9585,
10026,8832,9782,9408,8558,9594,8733,9771,8778,9726,
9079,10084,9081,10083,8781,9051,10087,8727,8660,
10056,9225,10202,9299,9020,10048,9131,10531,9133,
9289,9141,10127,9400,8701,9718,9034,10126,8930,8644,
9598,9508,8547,9054,8820,8954,10042,9013,8821,9775,
8742,9943,9070,9071,9788,8936,10128,8731,9631,8904,
9815,9068,10104,8803,9712,9798,8975,9939,9246,10209,
9018,9926,9201,9202,9306,10546,10318,8744,9940,9545,
10500,9234,8540,9406,8618,9253,10118,8589,9707,8640,
9583,8582,9559,8611,9548,9128,8647,9551,8927,9536,
9005,10047,9042,10060,8926,9799,9059,10106,9108,
10208,9407,8977,10043,9140,10100,9111,10089,9004,
10051,9269,10550,9570,9297,9252,9564,9264,9542,9908,
9909,9544,9911,9912,9520,10316,9307,8584,8607,9724,
8612,9592,8613,9627,8615,9615,8657,8658,10213,8632,
8637,9785,8655,9248,9529,8663,9829,8718,8720,8908,
8723,9778,8734,9736,8787,10044,8792,9773,8819,9727,
8827,9937,8828,10113,8903,9521,8911,10140,8941,8942,
8943,8947,10514,8950,10081,8963,9017,10062,9061,9113,
10136,9085,10517,9092,10412,9114,10072,9221,9229,9621,
9759,10512,9237,9241,9242,9298,9404,9513,9540,9541,
9553,9624,9626,9632,9702,9746,9791,9810,9913,9914,
10013,10046,10065,10070,10079,10090,10093,10112,10135,
10205,10207,10216,10405,10544,10554 */
Select 
    c.user_id as u_id,
    i.id as i_id,
    cf.content as full_name,
    cf1.content as userNumber,
    i.create_datetime as c_time,
    i.total as total,
    i.balance as balance,
    i.carried_balance as c_balance,
    i.create_datetime as c_date,
    i.currency_id as currency,
    g.status_value as i_status,
    GROUP_CONCAT(pi.payment_id
        SEPARATOR ',') as paymentString
FROM
    invoice i
        left join
    payment_invoice pi ON pi.invoice_id = i.id
        join
    contact c ON c.user_id = i.user_id
        join
    contact_field cf ON cf.contact_id = c.id
        join
    contact_field cf1 ON cf1.contact_id = c.id
        join
    generic_status g ON g.id = i.status_id
WHERE
    i.id in (SELECT 
            i.id
        FROM
            base_user u
                join
            contact c ON c.user_id = u.id
                join
            invoice i ON i.user_id = u.id
        where
            u.entity_id = 1 AND c.city like 1
                AND i.currency_id = 12
                AND i.create_datetime >= '2012-3-1'
                AND i.create_datetime < '2012-4-30'
                AND i.is_review = 0
                AND i.deleted = 0)
        AND cf.type_id = 432
        AND cf1.type_id = 434
group by i.id

